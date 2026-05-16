/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_02;
import java.util.List;
public class IteratorProduto implements Iterator{
    private List<Produto> produtos;
    private int posicao = 0;
    
    public IteratorProduto(List<Produto> produtos){
        this.produtos = produtos;
    }
    
    public boolean temProximo(){
        return posicao < produtos.size();
    }
    public Produto proximo(){
        return produtos.get(posicao++);
    }
}
