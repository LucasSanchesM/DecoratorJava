package decoratorexercicio;
public abstract class AdicionarAvaliacao implements Local{
    private String descricao;
    Local local;
    
    public AdicionarAvaliacao(Local q){
        this.local = q;
    }
    
}
