/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.dominio;

/**
 *
 * @author gsilvcor
 */
public class PedidoProdutoDTO {
    
    private int pedido_id;
    private String mesa;
    private String produtos;
    private String status_pedido;
    private Double valor_total;

    public PedidoProdutoDTO(int pedido_id, String mesa, String produtos, String status_pedido, Double valor_total) {
        this.pedido_id = pedido_id;
        this.mesa = mesa;
        this.produtos = produtos;
        this.status_pedido = status_pedido;
        this.valor_total = valor_total;
    }
    
    
    

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getStatus_pedido() {
        return status_pedido;
    }

    public void setStatus_pedido(String status_pedido) {
        this.status_pedido = status_pedido;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }
    

    
}
