/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.dominio;

/**
 *
 * @author gabriela and marcela
 */
public class Pedidos {

    private int id;
    private String mesa;
    private double valor_total;
    private String status_pedido;

    public int getId() {
        return id;
    }

    public String getMesa() {
        return mesa;
    }

    public double getValor_total() {
        return valor_total;
    }
    
    public String getStatus_pedido() {
        return status_pedido;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public void setStatus_pedido(String status_pedido) {
        this.status_pedido = status_pedido;
    }
    
}
