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
public abstract class Doce extends Produto {

    private String cobertura, sabor;

    public Doce() {
        super();
    }

    public Doce(String cobertura, String sabor, int codigo, double preco, double peso, String nome, String descricao) {
        super(codigo, preco, peso, nome, descricao);
        this.cobertura = cobertura;
        this.sabor = sabor;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
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
        str += "\ncobertura:" + cobertura;
        str += "\nsabor:" + sabor;
        return str;
    }

}
