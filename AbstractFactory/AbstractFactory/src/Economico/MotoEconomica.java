package Economico;
import abstractfactory.Motocicleta;

public class MotoEconomica extends Motocicleta{
    
    @Override
    public String descricao(){
        return "Moto Economica";
    }
    @Override
    public double preco(){
        return 12000;
    }
    
}
