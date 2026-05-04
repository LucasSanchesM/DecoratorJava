package Luxuoso;
import abstractfactory.Motocicleta;

public class MotoLuxuosa extends Motocicleta{
    @Override
    public String descricao(){
        return "Moto Luxuosa";
    }
    @Override
    public double preco(){
        return 56000;
    }
}
