package bridge;

public class Vulkan implements DesenhoApi{
    public void desenhar(double x, double y, double raio, String forma){
        System.out.println("Desenhando"+forma+"no Vulkan nas coordenas: " + x + "," + y +"\n" + "Com raio: " + raio + "\n");
    }
}
