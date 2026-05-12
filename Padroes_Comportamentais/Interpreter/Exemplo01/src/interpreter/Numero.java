package interpreter;

public class Numero implements Expressao{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    
    
    public int interpretar(){
        return numero;
    }
}
