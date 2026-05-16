/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_02;

public class Main {
    public static void main(String[] args) {
        ColecaoProdutos colecao = new ColecaoProdutos();
        
        colecao.adicionarProduto(new Produto("Mouse", 200));
        colecao.adicionarProduto(new Produto("Teclado", 350));
        colecao.adicionarProduto(new Produto("Monitor", 1200));
        
        Iterator it = colecao.createIterator();
        System.out.println("Produtos em promocao");
        
        while(it.temProximo()){
            System.out.println(it.proximo().getNome());
        }
    }
}
