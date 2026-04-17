package decoratorexercicio;

public class AvaliacaoOtima extends AdicionarAvaliacao{
    public AvaliacaoOtima(Local q){
        super(q);
    }
    @Override
    public String exibirDescricao(){
        return local.exibirDescricao()+ " e tem uma otima avaliacao";
    }   
}
