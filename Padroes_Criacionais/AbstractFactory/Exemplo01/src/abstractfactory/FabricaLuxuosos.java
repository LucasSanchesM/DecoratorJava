package abstractfactory;
import Luxuoso.*;
public class FabricaLuxuosos implements FabricaDeVeiculo{
    @Override
    public Carro criarCarro(){
        return new CarroLuxuoso();
    }
    public Motocicleta criarMoto(){
        return new MotoLuxuosa();
    }
}
