/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

/**
 *
 * @author aluno9
 */
public class ProcessadorEcommerce extends ProcessarPedido{
    @Override
    protected void verificarEstoque(){
        System.out.println("Verifcando estoque no banco de dados");
    }
    @Override
    protected void confirmarPagamento(){
        System.out.println("Pagamento confirmado");
    }
    
    @Override
    protected void entregar(){
        System.out.println("Gerando etiqueta para os correios");
        
    }
}
