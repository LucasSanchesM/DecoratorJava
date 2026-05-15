/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oberserver;
import java.util.*;
        
public class Main {

    public static void main(String[] args) {
        Licitante p1 = new Usuario("Jao");
        Licitante p2 = new Usuario("Gabriel");
        Licitante p3 = new Usuario("Roberto");
        
        PublicadorLeilao l1 = new Leilao();
        l1.adicionarLicitante(p1);
        l1.adicionarLicitante(p2);
        l1.adicionarLicitante(p3);
        
        l1.novoLance(2000);
    }
    
}
