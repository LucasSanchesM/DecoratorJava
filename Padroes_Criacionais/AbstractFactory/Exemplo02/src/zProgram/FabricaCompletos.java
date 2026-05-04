package zProgram;
import Completo.*;

public class FabricaCompletos implements FactoryRestaurante{
    @Override
    public Lanche criarLanche(){
        return new LancheCompleto();
    }
    public Bebida criarBebida(){
        return new BebidaCompleta();
    }
}
