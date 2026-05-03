package Intermediario;
import abstractfactory.Motocicleta;

public class MotoIntermediaria extends Motocicleta{
    
    @Override
    public String descricao(){
        return "Moto Intermediaria";
    }
    @Override
    public double preco(){
        return 24000;
    }
}
