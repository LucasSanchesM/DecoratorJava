package state;

public class Pago implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido){
        System.out.println("Pedido ja foi pago anteriormente...");
    }
    @Override
    public void entregar(Pedido pedido){
        System.out.println("Pedido saiu para entrega!");
        pedido.setEstadoAtual(new Entregue());
    }
    @Override
    public String getEstadoAtual(){
        return "Estado Atual: Pago!";
    }
}
