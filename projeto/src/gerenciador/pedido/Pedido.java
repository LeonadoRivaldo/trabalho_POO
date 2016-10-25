/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.pedido;

import gerenciador.produto.Produto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author leona_000
 */
public class Pedido {

    private List<Item> lista;
    private int totalDeItens;
    private double totalDoPedido;
    //aux
    private Item aux = null;

    public Pedido() {
        lista = new ArrayList();
        totalDeItens = 0;
    }

    public void calcularTotal() {
    }

    public String imprimirPedido() {
        String str = this.listaItens();
        str += "\n---------------------------------------";
        str += "\nTotal de itens: " + this.totalDeItens;
        str += "\nValor total: " + this.totalDoPedido;
        return str;
    }

    public double getValorTotal() {
        return 0.0;
    }

    public boolean addItem(Item item) {
        totalDeItens++;
        return lista.add(item);
    }

    public boolean removeItem(int indice) {
        aux = lista.remove(indice);
        return aux != null;
    }

    public Item getItem(int indice) {
        return lista.get(indice);
    }

    public String listaItens() {
        String str = "";
        int cont = 0;
        for (Item i : lista) {
            Produto p = i.getProduto();
            str += cont + 1 + " - Produto: " + p.getNome();
            str += " Preço: " + p.getPreco();
            str += " Peso: " + p.getPeso();
            str += " Total do item: " + i.getValorDoItem();
        }
        return str;
    }
}
