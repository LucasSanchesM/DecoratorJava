package zProgram;
import Simples.*;

public class FabricaSimples implements FactoryRestaurante{
    @Override
    public Lanche criarLanche(){
        return new LancheSimples();
    }
    
    @Override
    public Bebida criarBebida(){
        return new BebidaSimples();
    }
}
