package zProgram;
import Super.*;

public class FabricaSupers implements FactoryRestaurante{
    @Override
    public Lanche criarLanche(){
        return new LancheSuper();
    }
    @Override
    public Bebida criarBebida(){
        return new BebidaSuper();
    }
}
