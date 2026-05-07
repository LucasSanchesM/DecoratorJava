package chainofresponsability;

public class SuporteGerente extends SuporteHandler{
    @Override
    public void processarSolicitacao(String problema, int nivelDeDificuldade) {
        if(nivelDeDificuldade <= 3){
            System.out.println("Suporte Gerente: Resolvendo Problema");
        }else{
            System.out.println("Erro");
        }
    }
}
