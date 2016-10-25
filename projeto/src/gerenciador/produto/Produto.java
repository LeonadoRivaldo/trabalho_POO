/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.produto;

/**
 *
 * @author leona_000
 */
public abstract class Produto {

    private int codigo;
    private double preco, peso;
    private String nome, descricao;

    public Produto() {
    }

    public Produto(int codigo, double preco, double peso, String nome, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.peso = peso;
        this.nome = nome;
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String str = "";
        str += "\nNome:" + nome;
        str += "\nDescricao: " + descricao;
        return str;
    }

}
