package state;

public class AguardandoPagamento implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido){
        System.out.println("Pedido Pago!");
        pedido.setEstadoAtual(new Pago());
    }
    @Override
    public void entregar(Pedido pedido){
        System.out.println("É necessãrio pagar para liberação da entrega");
    }
    @Override
    public String getEstadoAtual(){
        return "Estado Atual: Aguardando Pagamento!";
    }
}
