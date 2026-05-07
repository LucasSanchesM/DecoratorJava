package chainofresponsability;

public class SuporteTecnico extends SuporteHandler{
    @Override
    public void processarSolicitacao(String problema, int nivelDeDificuldade) {
        if(nivelDeDificuldade <= 2){
            System.out.println("Suporte Tecnico: Resolvendo Problema");
        }else{
            proximo.processarSolicitacao(problema, nivelDeDificuldade);
        }
    }
}
