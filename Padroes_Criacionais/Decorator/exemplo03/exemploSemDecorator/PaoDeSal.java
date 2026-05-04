package padariaalegria;

public class PaoDeSal {
    private boolean temManteiga = false;
    private double preco = 1;
    private boolean temPresunto = false;
    public String descricao(){
        if((temManteiga==true) && (temPresunto == false)){
            return "Pao de Sal\ncom manteiga\n";
        }
        else if(temManteiga == true && temPresunto == true){
            return "Pao de sal\ncom manteiga\ncom presunto\n";
        }
        else if((temManteiga == false) && (temPresunto == true)){
            return "Pao de sal\ncom presunto\n";
        }
        else{
            return "Pao de Sal\n";
        }
    }
    
    public double preco(){
        if((temManteiga==true) && (temPresunto == false)){
            return preco + 0.50;
        }
        else if(temManteiga == true && temPresunto == true){
            return preco + 1.50;
        }
        else if((temManteiga == false) && (temPresunto == true)){
            return preco + 1.0;
        }
        else{
            return preco;
        }
    }
    
    public void colocarManteiga(){
        temManteiga = true;
    }
    public void colocarPresunto(){
        temPresunto = true;
    }
    
}
