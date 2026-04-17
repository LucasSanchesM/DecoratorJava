package main;

public class Chocolate extends AdicionalDecorator{
    public Chocolate(Bebida b){
        super(b);
    }
    
    @Override
    public String getDescricao(){
        return b.getDescricao()+ " com Chocolatinho";
    }
    
    @Override
    public double getCusto(){
        return b.getCusto()+2;
    }
    
}
