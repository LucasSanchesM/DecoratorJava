package decoratorexercicio;
public abstract class AdicionarAvaliacao implements Local{
    Local local;
    
    public AdicionarAvaliacao(Local q){
        this.local = q;
    }
    
}
