package bridge;

public class DirectX implements DesenhoApi{
    @Override
    public void desenhar(double x, double y, double raio, String forma){
        System.out.println("Desenhando "+ forma + " no DirectX nas coordenas: " + x + "," + y +"\n" + "Com raio: " + raio + "\n");
    }
}
