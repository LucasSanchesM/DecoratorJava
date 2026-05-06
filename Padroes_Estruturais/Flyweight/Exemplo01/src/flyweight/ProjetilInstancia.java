package flyweight;
import frames.Projetil;

public class ProjetilInstancia {
    private Projetil projetil;
    private double posicaoX, posicaoY;

    public ProjetilInstancia(Projetil projetil, double posicaoX, double posicaoY) {
        this.projetil = projetil;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    public void renderizar(){
        projetil.renderizar(posicaoX, posicaoY);
    }
}
