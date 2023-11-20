/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela and marcela
 */
public class FabricaConexao {
    
    public static Connection conexao() throws SQLException {
    Connection con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = ("jdbc:mysql://127.0.0.1/sistema_pedidos");
        con = DriverManager.getConnection(url, "root", "Root@1993");
    } catch (ClassNotFoundException ex) {
        throw new SQLException("Driver do MySQL não encontrado.", ex);
    }
    return con;
}
    
}
