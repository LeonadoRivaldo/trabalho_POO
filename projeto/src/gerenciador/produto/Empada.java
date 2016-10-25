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
public class Empada extends Salgado {

    private String tipo;

    public Empada() {
        super();
    }

    public Empada(String tipo, String sabor, int codigo, double preco, double peso, String nome, String descricao) {
        super(sabor, codigo, preco, peso, nome, descricao);
        this.tipo = tipo;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String str = super.toString();
        if (this.tipo.equalsIgnoreCase("doce")) {
            str += "\nEmpada doce";
        } else {
            str += "\nEmpada Salgada";
        }
        return str;
    }

}
