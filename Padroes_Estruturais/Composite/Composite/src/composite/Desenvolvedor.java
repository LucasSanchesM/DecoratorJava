package composite;

public class Desenvolvedor implements Empregado{
    String nome;
    double salario;
    
    public Desenvolvedor(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public double getSalario(){
        return salario;
    }
    @Override
    public String getDescricao(){
        return nome + "- R$" + salario + "\n";
    }
}
