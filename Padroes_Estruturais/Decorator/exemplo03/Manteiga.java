package padaria.sonho;

public class Manteiga extends Recheio{
    public Manteiga(Comida a){
        super(a);
    }

    @Override
    public String descricao(){
        return alimento.descricao()+ "\ncom manteiga";
    }
    
    @Override
    public double preco(){
        return alimento.preco()+0.50;
    }
}
