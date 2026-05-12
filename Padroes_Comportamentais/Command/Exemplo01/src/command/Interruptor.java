
package command;

public class Interruptor {
    ICommand comando;
    
    public Interruptor(ICommand comando){
        this.comando = comando;
    }
    
    public void execute(){
        comando.fazer();
    }
}
