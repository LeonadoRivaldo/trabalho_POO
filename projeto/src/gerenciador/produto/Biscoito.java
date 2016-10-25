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
public class Biscoito extends Doce {

    private boolean gotasDeChocolate;
    private GotasChocolate saborGotas;

    public boolean isGotasDeChocolate() {
        return gotasDeChocolate;
    }

    public void setGotasDeChocolate(boolean gotasDeChocolate) {
        this.gotasDeChocolate = gotasDeChocolate;
    }

    public String getTipo() {
        if (saborGotas.getTipo() == 1) {
            return "amaro";
        } else if (saborGotas.getTipo() == 2) {
            return "branco";
        } else {
            return "ao leite";
        }

    }

    public Biscoito() {
        super();
    }

    public Biscoito(boolean gotasDeChocolate, GotasChocolate saborGotas, String cobertura, String sabor, int codigo, double preco, double peso, String nome, String descricao) {
        super(cobertura, sabor, codigo, preco, peso, nome, descricao);
        this.gotasDeChocolate = gotasDeChocolate;
        this.saborGotas = saborGotas;
    }

    @Override
    public String toString() {
        String str = super.toString();
        if (!gotasDeChocolate) {
            str += "\nExtra: Com gotas de chocolate" + this.getTipo();
        } else {
            str += "\nExtra: Sem gotas de chocolate";
        }
        return str;
    }

}
