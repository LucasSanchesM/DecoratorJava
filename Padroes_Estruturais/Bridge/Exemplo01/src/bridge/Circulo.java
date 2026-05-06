package bridge;

public class Circulo extends Forma{
    private double x, y, raio;
    private String forma;
    
    public Circulo(DesenhoApi desenhoApi, double x, double y, double raio, String forma){
        super(desenhoApi);
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.forma = forma;
    }
    public void desenhar(){
        desenhoApi.desenhar(x, y, raio, forma);
    }
}
