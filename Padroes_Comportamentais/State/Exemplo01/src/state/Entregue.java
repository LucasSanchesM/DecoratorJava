package state;

public class Entregue implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido){
        System.out.println("Pedido ja foi finalizado, pagamento ja recebido...");
    }
    @Override
    public void entregar(Pedido pedido){
        System.out.println("Pedido ja foi finalizado, entrega ja realizada...");
    }
    @Override
    public String getEstadoAtual(){
        return "Estado Atual: Entregue!";
    }
}
