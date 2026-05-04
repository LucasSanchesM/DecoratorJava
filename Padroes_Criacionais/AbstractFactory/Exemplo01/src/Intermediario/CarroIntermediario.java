package Intermediario;
import abstractfactory.Carro;

public class CarroIntermediario extends Carro{
    
    @Override
    public String descricao(){
        return "Carro Intermediario";
    }
    @Override
    public double preco(){
        return 34000;
    }
}
