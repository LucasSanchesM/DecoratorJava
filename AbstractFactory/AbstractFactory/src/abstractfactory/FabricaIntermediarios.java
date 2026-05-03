package abstractfactory;
import Intermediario.*;

public class FabricaIntermediarios implements FabricaDeVeiculo{
    @Override
    public Carro criarCarro(){
        return new CarroIntermediario();
    }
    
    public Motocicleta criarMoto(){
        return new MotoIntermediaria();
    }
}
