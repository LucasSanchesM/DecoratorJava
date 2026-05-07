package proxy;

public class Main {
    public static void main(String[] args) {
        Cafes cafe = new ProxyCafeSimples(0.5);
        cafe.colocarIngredientes("Pó de Cafe");
        cafe.colocarIngredientes("Agua Fervente");
        cafe.exibir();
    }
    
}
