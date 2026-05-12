package composite;
import java.util.ArrayList;


public class DepartamentoA implements Empregado{
    private String nome;
    private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
    
    public DepartamentoA(String nome){
        this.nome = nome;
    }
    @Override
    public double getSalario(){
        double total = 0;
        for(Empregado empregado : listaEmpregados){
            total += empregado.getSalario();
        }
        return total;
    }
    @Override
    public String getDescricao(){
        String descricaoTotal = nome+ ":" + "\n";
        for(Empregado empregado : listaEmpregados){
            descricaoTotal += empregado.getDescricao();
        }
        return descricaoTotal;
    }
    public void adicionarEmpregado(Empregado e){
        listaEmpregados.add(e);
    } 
}
