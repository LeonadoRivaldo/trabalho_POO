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
public enum TipoPao {

    FRANCES(1),
    BOLOCHA(2),
    FORMA(3),
    CERVEJINHA(4),
    SOVADO(5);

    private int tipo;

    TipoPao(int n) {
        this.tipo = n;
    }

    public int getTipo() {
        return tipo;
    }
}
