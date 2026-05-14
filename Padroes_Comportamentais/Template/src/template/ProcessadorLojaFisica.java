/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

public class ProcessadorLojaFisica extends ProcessarPedido{
    @Override
    public void verificarEstoque(){
        System.out.println("Vendedor conferindo prateleira...");
    }
    @Override
    public void confirmarPagamento(){
        System.out.println("Lendo cartao do banco...");
    }
    @Override
    public void entregar(){
        System.out.println("Entrega sendo feita...");
    }
}
