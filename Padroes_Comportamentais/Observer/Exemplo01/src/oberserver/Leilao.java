package oberserver;
import java.util.ArrayList;
import java.util.List;
public class Leilao implements PublicadorLeilao{
    private List<Licitante> licitantes = new ArrayList<>();
    private double maiorLance;
    
    @Override
    public void adicionarLicitante(Licitante a) {
        licitantes.add(a);
    }

    @Override
    public void removerLicitante(Licitante a) {
        licitantes.remove(a);
    }

    @Override
    public void notificarLicitante() {
        
        
    }
    
    public void novoLance(double valor){
        this.maiorLance = valor;
        for(Licitante l : licitantes){
            l.aviso("Novo lance: "+ maiorLance);
        }
    }
}
