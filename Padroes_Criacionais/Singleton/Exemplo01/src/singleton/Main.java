package singleton;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = FactoryPizza.INSTANCE.criarPizza("MArguerita", "Familia");
        System.out.println(pizza);
    }

}
