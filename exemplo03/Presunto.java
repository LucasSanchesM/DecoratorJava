package padaria.sonho;

public class Presunto extends Recheio{
    public Presunto(Comida a){
        super(a);   
    }
  
    @Override
    public String descricao(){
        return alimento.descricao() + "\ncom presunto";
    }
    
    @Override
    public double preco(){
        return alimento.preco()+1;
    }
}
