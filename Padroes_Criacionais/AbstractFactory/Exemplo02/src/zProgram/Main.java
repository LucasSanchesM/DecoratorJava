package zProgram;

public class Main {

    public static void main(String[] args) {
        FactoryRestaurante fabrica = new FabricaSimples();
        Lanche lanche = fabrica.criarLanche();
        Bebida bebida = fabrica.criarBebida();
        
        System.out.println("Lanche: " + lanche.descricao() + "\nPreco: R$" + lanche.preco() + "\n");
        System.out.println("Bebida: " + bebida.descricao() + "\nPreco: R$" + bebida.preco() + "\n");

        
    }
    
}
