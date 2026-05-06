package frames;

public class Projetil {
    private String tipo;
    private String cor;
    private double danoBase;

    public Projetil(String tipo, String cor, double danoBase) {
        this.tipo = tipo;
        this.cor = cor;
        this.danoBase = danoBase;
    }
    
    public void renderizar(double x, double y){
        System.out.println("Projetil: " +tipo+ "\nCor: " +cor+ "\nDano Base: " +danoBase +"\n"+ "\nPosicao: " + x + " ; " + y);
    }
    
}
