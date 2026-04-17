package padaria.sonho;

public abstract class Recheio implements Comida{
    Comida alimento;
    public Recheio(Comida a){
        this.alimento = a;
    }
}
