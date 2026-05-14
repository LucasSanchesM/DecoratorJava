package template;

public abstract class ProcessarPedido {
    public final void processar(Pedido pedido){
        verificarEstoque();
        confirmarPagamento();
        entregar();
        System.out.println("Processo concluido");
    }
    
    protected abstract void verificarEstoque();
    
    protected abstract void confirmarPagamento();
    
    protected abstract void entregar();
    
    
    
}