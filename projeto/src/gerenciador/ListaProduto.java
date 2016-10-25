/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import gerenciador.produto.Produto;

/**
 *
 * @author leona_000
 */
public interface ListaProduto {
    
    public boolean addProduto(Produto produto);
    public boolean removeProduto(int codigo);
    public Produto getProduto( int codigo );
    
    
}
