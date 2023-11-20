/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.dominio;

/**
 *
 * @author gabriela and marcela
 */
public class Produto {
    private int id;
    private String nome;
    private double valor;
    private boolean disponibilidade;

    public Produto(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
    public boolean getDisponibilidade() {
        return disponibilidade;
    }
}
