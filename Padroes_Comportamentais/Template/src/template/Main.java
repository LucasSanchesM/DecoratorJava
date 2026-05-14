package template;

public class Main {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(1);
        p1.adicionarItem(new Item("Mouse", 50.0));
        ProcessarPedido processador;
        System.out.println("Testando venda online");
        processador = new ProcessadorEcommerce();
        
        processador.processar(p1);
        
        System.out.println("Testando venda presencial");
        processador = new ProcessadorLojaFisica();
        processador.processar(p1);
    }
    
}
