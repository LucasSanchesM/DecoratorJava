/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo_02;
import java.util.ArrayList;
import java.util.List;
public class ColecaoProdutos {
    private List<Produto> produtos = new ArrayList<>();
    public void adicionarProduto(Produto p){
        produtos.add(p);
    }
    public Iterator createIterator(){
        return new IteratorProduto(produtos);
    }
}
