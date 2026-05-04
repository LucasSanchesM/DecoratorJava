package singleton;

public class FactoryPizza {
    public static final FactoryPizza INSTANCE = new FactoryPizza();
    //O construtor privado garante que apenas metodos internos possam instanciar esta classe, sendo assim existe apenas
    //uma unica instancia: definida, chamada instance
    private FactoryPizza(){
    }
    
    public Pizza criarPizza(String sabor, String tamanho){
        return new Pizza(sabor, tamanho);
    }
}
