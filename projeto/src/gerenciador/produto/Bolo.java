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
public class Bolo extends Doce {

    private String recheio;

    public Bolo() {
        super();
    }

    public Bolo(String recheio, String cobertura, String sabor, int codigo, double preco, double peso, String nome, String descricao) {
        super(cobertura, sabor, codigo, preco, peso, nome, descricao);
        this.recheio = recheio;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRecheio: " + recheio;
    }

}
