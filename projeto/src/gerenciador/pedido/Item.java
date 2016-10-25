/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.pedido;

import gerenciador.produto.Produto;

/**
 *
 * @author leona_000
 */
public class Item {

    private Produto produto;
    private double valorDoItem, peso;

    public Item() {
    }

    public Item(Produto produto) {
        this.produto = produto;
        this.peso = produto.getPeso();
        this.valorDoItem = this.calcularValor();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public void setValorDoItem(double valorDoItem) {
        this.valorDoItem = valorDoItem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularValor() {
        return this.peso * this.produto.getPreco();
    }

    @Override
    public String toString() {
        String str = "";
        str += "\n=============================";
        str += produto.toString();
        str += "\n=============================";
        str += "\nNalor do item: " + valorDoItem;
        str += "\nPeso: " + peso;
        str += "\n==============================";
        return str;
    }

}
