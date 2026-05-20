package state;

public interface EstadoPedido {
    void pagar(Pedido pedido);
    void entregar(Pedido pedido);
    String getEstadoAtual();
}
