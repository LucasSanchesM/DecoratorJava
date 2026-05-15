/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oberserver;

public class Usuario implements Licitante{
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void aviso(String mensagem) {
        System.out.println(nome + " notificado->" + mensagem);
    }
    
}
