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
public class Pizza extends Salgado {

    private boolean comBorda;

    public Pizza() {
        super();
    }

    public Pizza(boolean comBorda, String sabor, int codigo, double preco, String nome, String descricao) {
        super(sabor, codigo, preco, nome, descricao);
        this.comBorda = comBorda;
    }

    /**
     * @return the comBorda
     */
    public boolean isComBorda() {
        return comBorda;
    }

    /**
     * @param comBorda the comBorda to set
     */
    public void setComBorda(boolean comBorda) {
        this.comBorda = comBorda;
    }

    @Override
    public String toString() {
        String str = super.toString();
        if (this.comBorda) {
            str += "\nPizza com borda";
        } else {
            str += "\nPizza sem borda";
        }
        return str;
    }

}
