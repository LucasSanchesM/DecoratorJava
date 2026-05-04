package Economico ;
import abstractfactory.Carro;

public class CarroEconomico extends Carro{
    
    @Override
    public String descricao(){
        return "Carro Economico";
    }
    @Override
    public double preco(){
        return 22000;
    }
    
}
