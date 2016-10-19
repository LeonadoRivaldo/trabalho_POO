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
    private double preco;
    private String nome, descricao;
    
    
    public Produto(){
    }
    
    public Produto(int codigo, double preco, String nome, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
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
