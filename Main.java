package main;

public class Main {

    public static void main(String[] args) {
        Bebida cafeThalyson = new CafeSimples();
        cafeThalyson = new Leite(cafeThalyson);
        
        Bebida cafeLucas = new CafeSimples();
        cafeLucas = new Chocolate(cafeLucas);
    
        System.out.printf("\nDescricao: %s\nPreco: %.2f\n", cafeThalyson.getDescricao(), cafeThalyson.getCusto());
        System.out.printf("\nDescricao: %s\nPreco: %.2f\n", cafeLucas.getDescricao(), cafeLucas.getCusto());
    }
    
}
