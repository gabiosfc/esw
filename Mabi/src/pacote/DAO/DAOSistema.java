/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import pacote.dominio.PedidoProdutoDTO;
import pacote.dominio.PedidoProdutos;
import pacote.dominio.Produto;
import pacote.dominio.Pedidos;


public class DAOSistema {

    private Connection con;
    private PreparedStatement comando;

    private void conectar() {
        try {
            con = FabricaConexao.conexao();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Produto> obterProdutosDisponiveis() {
        conectar();
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            String query = "SELECT * FROM cardapio WHERE disponibilidade = true";
            comando = con.prepareStatement(query);

            try (ResultSet resultado = comando.executeQuery()) {
                while (resultado.next()) {
                    int id = resultado.getInt("id_produto");
                    String nome = resultado.getString("nome");
                    double valor = resultado.getDouble("valor");

                    Produto produto = new Produto(id, nome, valor);
                    produtos.add(produto);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter produtos do cardápio: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            fechar();
        }

        return produtos;
    }

    public int inserePedido(Pedidos pedidos) {
        conectar();
        String sql = "INSERT INTO pedidos (mesa, valor_total, status_pedido) VALUES (?, ?, ?)";
        int idPedidoInserido = -1;

        try {
            comando = con.prepareStatement(sql, new String[]{"id"});
            comando.setString(1, pedidos.getMesa());
            comando.setDouble(2, pedidos.getValor_total());
            comando.setString(3, pedidos.getStatus_pedido());

            comando.executeUpdate();

            ResultSet generatedKeys = comando.getGeneratedKeys();
            if (generatedKeys.next()) {
                idPedidoInserido = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Falha ao obter o ID do pedido.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar pedido." + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }

        return idPedidoInserido;
    }

    public void inserePedidoProdutos(PedidoProdutos pedido) {
        conectar();
        String sql = "INSERT INTO pedido_produtos (id_pedido, id_produto, quantidade) VALUES (?, ?, ?)";

        try {
            comando = con.prepareStatement(sql, new String[]{"id"});
            comando.setInt(1, pedido.getId_pedido());
            comando.setInt(2, pedido.getId_produto());
            comando.setInt(3, pedido.getQuantidade());

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet generatedKeys = comando.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idPedidoProduto = generatedKeys.getInt(1);
                    System.out.println("PedidoProduto inserido com sucesso. ID gerado: " + idPedidoProduto);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar pedido." + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
    }

    public ArrayList<PedidoProdutoDTO> selecionarTodosRegistros() {
         conectar();
    ResultSet rs;
    String sql = "SELECT " +
                "    p.id AS id_pedido," +
                "    p.mesa," +
                "    p.valor_total," +
                "    GROUP_CONCAT(CONCAT(c.nome, ' (', pp.quantidade, ')') ORDER BY pp.id_produto SEPARATOR ', ') AS produtos," +
                "    p.status_pedido " +
                "FROM " +
                "    pedidos p " +
                "JOIN " +
                "    pedido_produtos pp ON p.id = pp.id_pedido " +
                "JOIN " +
                "    cardapio c ON pp.id_produto = c.id_produto " +
                "WHERE " +
                "    p.status_pedido <> 'Pago' " + 
                "GROUP BY " +
                "    p.id";

        ArrayList<PedidoProdutoDTO> listaPedidos = new ArrayList();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                PedidoProdutoDTO pedido = new PedidoProdutoDTO(rs.getInt("id_pedido"),
                        rs.getString("mesa"),
                        rs.getString("produtos"),
                        rs.getString("status_pedido"),
                        rs.getDouble("valor_total"));
//                PedidoProdutoDTO.setPedido_id(1);//rs.getInt("id_pedido"));
//                PedidoProdutoDTO.setMesa(rs.getString("mesa"));
//                PedidoProdutoDTO.setValor_total(rs.getDouble("valor_total"));
//                PedidoProdutoDTO.setProdutos(rs.getString("produtos"));
//                PedidoProdutoDTO.setStatus_pedido(rs.getString("status_pedido"));
                listaPedidos.add(pedido);
            }
            fechar();
            return listaPedidos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro." + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }

    }
    
    public String obterStatusAtualDoBanco(int idPedido) {
        conectar();
        ResultSet rs;
        String sql = "SELECT status_pedido FROM pedidos WHERE id = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setInt(1, idPedido);
            rs = comando.executeQuery();
            if (rs.next()) {
                return rs.getString("status_pedido");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter status atual do banco." + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
        return null; 
    }
    
    public void atualizarStatusPedido(int idPedido, String novoStatus) {
        conectar();

        String sql = "UPDATE pedidos SET status_pedido = ? WHERE id = ?";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, novoStatus);
            comando.setInt(2, idPedido);

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Status do pedido atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar status do pedido." + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
    }

    private void fechar() {
        try {
            if (comando != null) {
                comando.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
