package interpreter;

public class Somar implements Expressao{
    private Expressao num1;
    private Expressao num2;
    
    public Somar(Expressao num1, Expressao num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int interpretar(){
        return num1.interpretar() + num2.interpretar();
    }
}
