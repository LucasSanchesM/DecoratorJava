package command;

public class Main {

    public static void main(String[] args) {
        Luz luzCozinha = new Luz();
        LigarLuz ligarLuz = new LigarLuz(luzCozinha);
        DesligarLuz desligarLuz = new DesligarLuz(luzCozinha);
        
        Interruptor praCima = new Interruptor(ligarLuz);
        Interruptor praBaixo = new Interruptor(desligarLuz);
        
        praCima.execute();
    }
    
}
