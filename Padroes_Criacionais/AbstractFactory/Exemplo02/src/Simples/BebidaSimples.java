package Simples;
import zProgram.Bebida;

public class BebidaSimples extends Bebida{
    @Override
    public String descricao(){
        return "Refrigerante 200ml";
    }
    @Override
    public double preco(){
        return 5;
    }
}
