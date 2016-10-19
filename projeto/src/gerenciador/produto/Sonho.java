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
public class Sonho extends Doce {

    private String Cozimento;

    public Sonho() {
    }

    public Sonho(String Cozimento, String cobertura, String sabor, int codigo, double preco, String nome, String descricao) {
        super(cobertura, sabor, codigo, preco, nome, descricao);
        this.Cozimento = Cozimento;
    }

    public String getCozimento() {
        return Cozimento;
    }

    public void setCozimento(String Cozimento) {
        this.Cozimento = Cozimento;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nCozimento:" + Cozimento;
        return str;
    }

}
