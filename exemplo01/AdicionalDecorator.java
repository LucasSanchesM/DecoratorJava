package main;

public abstract class AdicionalDecorator implements Bebida{
    protected Bebida b;
    public AdicionalDecorator (Bebida b){
        this.b = b;
    }
}
