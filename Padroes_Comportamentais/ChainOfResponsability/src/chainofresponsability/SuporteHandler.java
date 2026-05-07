package chainofresponsability;

public abstract class SuporteHandler {
    public SuporteHandler proximo;

    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }
    
    public abstract void processarSolicitacao(String problema, int nivelDeDificuldade);
}
