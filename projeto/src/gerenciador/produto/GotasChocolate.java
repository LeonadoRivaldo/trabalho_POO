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
public enum GotasChocolate {

    AMARO(1),
    BRANCO(2),
    AOLEITE(3);

    private int tipo;

    GotasChocolate(int n) {
        this.tipo = n;
    }

    public int getTipo() {
        return tipo;
    }
}
