/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import java.util.List;
import java.util.ArrayList;
import gerenciador.produto.Produto;

/**
 *
 * @author leona_000
 */
public class ListaProdutos implements ListaProduto {

    private List<Produto> lista;

    public ListaProdutos() {
        lista = new ArrayList();
    }

    @Override
    public boolean addProduto(Produto produto) {
        Produto p = this.getProduto(produto.getCodigo());
        if (p == null) {
            return this.lista.add(produto);
        }
        return false;
    }

    @Override
    public boolean removeProduto(int codigo) {
        Produto p = this.getProduto(codigo);
        if (p != null) {
            int cod = this.lista.indexOf(p);
            lista.remove(cod);
            return true;
        }
        return false;
    }

    @Override
    public Produto getProduto(int codigo) {
        for (Produto p : lista) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public String listaProdutos() {
        String str = "";
        str += "\n##################################";
        str += "\nLista de produtos";
        str += "\n==================================";
        for (Produto p : lista) {
            str += "\n" + p.toString();
            str += "\n==================================";
        }
        return str;
    }
}
