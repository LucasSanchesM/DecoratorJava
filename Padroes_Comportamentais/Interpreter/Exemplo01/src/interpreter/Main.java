package interpreter;

public class Main {

    public static void main(String[] args) {
        Numero num2 = new Numero(2);
        Numero num3 = new Numero(3);
        Numero num4 = new Numero(4);
        
        Somar soma = new Somar(num2, num3);
        Subtracao sub = new Subtracao(soma, num4);
        
        System.out.println(sub.interpretar());
        
    }
    
}
