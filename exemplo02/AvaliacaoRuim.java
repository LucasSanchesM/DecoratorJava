package decoratorexercicio;

public class AvaliacaoRuim extends AdicionarAvaliacaoQ{
    public AvaliacaoRuim(Local q){
        super(q);
    }
    @Override
    public String exibirDescricao(){
        return local.exibirDescricao() + " e tem uma avaliacao ruim";
    }
}
