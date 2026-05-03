package Luxuoso;
import abstractfactory.Carro;

public class CarroLuxuoso extends Carro{
    @Override
    public String descricao(){
        return "Carro Luxuoso";
    }
    @Override
    public double preco(){
        return 66000;
    }
}
