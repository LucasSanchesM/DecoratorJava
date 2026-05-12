package interpreter;

public class Subtracao implements Expressao{
    private Expressao num1;
    private Expressao num2;
    
    public Subtracao(Expressao num1, Expressao num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int interpretar(){
        return num1.interpretar() - num2.interpretar();
    }
}
