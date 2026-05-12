package command;

public class DesligarLuz implements ICommand{
    Luz luz;
    public DesligarLuz(Luz luz){
        this.luz = luz;
    }
    
    public void fazer(){
        this.luz.desligarLuz();
    }
    public void desfazer(){
        this.luz.ligarLuz();
    }
}
