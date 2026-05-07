package chainofresponsability;

public class SuporteBasico extends SuporteHandler{
    
    @Override
    public void processarSolicitacao(String problema, int nivelDeDificuldade) {
        if(nivelDeDificuldade <= 1){
            System.out.println("Suporte Basico: Resolvendo Problema");
        }else{
            proximo.processarSolicitacao(problema, nivelDeDificuldade);
        }
    }
    
}
