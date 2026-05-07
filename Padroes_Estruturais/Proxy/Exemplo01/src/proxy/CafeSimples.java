package proxy;

import java.util.ArrayList;

public class CafeSimples implements Cafes{
    private double quantidadeEmLitros;
    private ArrayList<String> ingredientes = new ArrayList<String>();
    
    public CafeSimples(double quantidadeEmLitros){
        this.quantidadeEmLitros = quantidadeEmLitros;
    }
    
    @Override
    public void colocarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }
    
    @Override
    public void exibir(){
        System.out.println("\nCafe Simples " + quantidadeEmLitros + " Litro(s)\n" + "Ingrendientes:");
        for(String ingrediente : ingredientes){
            System.out.println(ingrediente + ";");
        }
    }
    
}
