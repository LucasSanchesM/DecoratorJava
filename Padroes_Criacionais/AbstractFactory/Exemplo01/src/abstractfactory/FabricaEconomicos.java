package abstractfactory;
import Economico.*;

public class FabricaEconomicos implements FabricaDeVeiculo{
    @Override
    public Carro criarCarro(){
        return new CarroEconomico();
    }
    @Override
    public Motocicleta criarMoto(){
        return new MotoEconomica();
    }
}
