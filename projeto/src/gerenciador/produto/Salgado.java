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
public abstract class Salgado extends Produto {

    private String sabor;

    public Salgado() {
        super();
    }

    public Salgado(String sabor, int codigo, double preco, String nome, String descricao) {
        super(codigo, preco, nome, descricao);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nSabor: " + sabor;
        return str;
    }

}
