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
public class Pao extends Produto {

    private TipoPao tipo;

    public Pao() {
        super();
    }

    public Pao(TipoPao tipo, int codigo, double preco, String nome, String descricao) {
        super(codigo, preco, nome, descricao);
        this.tipo = tipo;
    }

    public String getTipo() {
        if (tipo.getTipo() == 1) {
            return "Pao frances";
        } else if (tipo.getTipo() == 2) {
            return "Bolacha amanteigada";
        } else if (tipo.getTipo() == 3) {
            return "Pão de forma fatiado";
        } else if (tipo.getTipo() == 4) {
            return "Pão cervejinha";
        } else {
            return "Pão sovado";
        }

    }

}
