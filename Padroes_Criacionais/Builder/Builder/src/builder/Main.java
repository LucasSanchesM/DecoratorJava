/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa builder = new Pessoa.Builder()
                .nome("Joao")
                .email("emailteste@teste.com")
                .idade(9)
                .username("joazinho2")
                .build();
       
        System.out.println(builder);
    }
    
}
