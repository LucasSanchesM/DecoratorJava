package chainofresponsability;

public class Main {

    public static void main(String[] args) {
        SuporteBasico basico = new SuporteBasico();
        SuporteTecnico tecnico = new SuporteTecnico();
        SuporteGerente gerente = new SuporteGerente();
        
        basico.setProximo(tecnico);
        tecnico.setProximo(gerente);
        
        basico.processarSolicitacao("Computador travando", 1);
    }
    
}
