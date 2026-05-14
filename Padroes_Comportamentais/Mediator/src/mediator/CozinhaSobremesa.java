package mediator;
public class CozinhaSobremesa extends Cozinha{
    public CozinhaSobremesa(BalcaoMediator balcao){
        super(balcao);
    }
    
    public boolean temPrato(String nome){
        //pra agilizar o processo, vou dizer que minha unica sobremesa é bolo
        return nome.equals("Bolo");
    } 
}
