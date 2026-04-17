package padaria.sonho;

public class PaoDeSal implements Comida{
    double preco=1.0;
    @Override
    public String descricao(){
        return "Pao de sal";
    }
    
    @Override
    public double preco(){
        return preco;
    }   
}
