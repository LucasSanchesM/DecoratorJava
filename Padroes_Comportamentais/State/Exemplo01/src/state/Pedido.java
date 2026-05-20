package state;

public class Pedido {
    private EstadoPedido estadoAtual;
    
    public Pedido(EstadoPedido estadoInicial){
        this.estadoAtual = estadoInicial;
    }
    public void setEstadoAtual(EstadoPedido estado){
        this.estadoAtual = estado;
    }
    
    public void pagar(){
        this.estadoAtual.pagar(this);
    }
    public void entregar(){
        this.estadoAtual.entregar(this);
    }
    public String getEstadoAtual(){
        return estadoAtual.getEstadoAtual();
    }
}
