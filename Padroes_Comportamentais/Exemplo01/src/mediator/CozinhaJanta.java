package mediator;

public class CozinhaJanta extends Cozinha{
    public CozinhaJanta(BalcaoMediator balcao){
        super(balcao);
    }
    
    public boolean temPrato(String nome){
        //pra agilizar o processo, vou dizer que minha unica janta é lasanha
        return nome.equals("Lasanha");
    }
}
