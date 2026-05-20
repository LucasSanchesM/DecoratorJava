package state;

public class Main {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido(new AguardandoPagamento());
        System.out.println(meuPedido.getEstadoAtual());
        meuPedido.pagar();
        System.out.println(meuPedido.getEstadoAtual());
        meuPedido.entregar();
        System.out.println(meuPedido.getEstadoAtual());
    }   
}