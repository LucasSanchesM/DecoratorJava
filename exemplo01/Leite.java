package main;

public class Leite extends AdicionalDecorator{
    public Leite(Bebida b){
        super(b);
    }
  
    @Override
    public String getDescricao(){
        return b.getDescricao()+" com Leite";
    }
    
    @Override
    public double getCusto(){
        return b.getCusto()+ 1.50;
    }
    
}
