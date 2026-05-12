package command;

public class LigarLuz implements ICommand{
    Luz luz;
    public LigarLuz(Luz luz){
        this.luz = luz;
    }
    
    public void fazer(){
        this.luz.ligarLuz();
    }
    public void desfazer(){
        this.luz.desligarLuz();
    }
}
