package command;

public class Luz {
    boolean state = false;
    
    public void ligarLuz(){
        if( this.state == true){
            System.out.println("A luz ja esta ligada!");
        }
        else{
            this.state = true;
            System.out.println("Luz ligada...");
        }
    }
    public void desligarLuz(){
        if(this.state == false){
            System.out.println("A luz ja esta desligada!");
        }
        else{
            this.state = false;
            System.out.println("Luz desligada...");
        }
    }
}
