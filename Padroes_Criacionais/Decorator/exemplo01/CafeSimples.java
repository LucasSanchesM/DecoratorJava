package main;
public class CafeSimples implements Bebida{
    @Override
    public String getDescricao(){
         return "Cafe simples";
    }
    
    @Override
    public double getCusto(){
        return 5.0;
    }
    
}
