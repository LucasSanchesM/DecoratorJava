package flyweight;

public class Main {
    public static void main(String[] args) {
        ProjetilInstancia novoProjetil = new ProjetilInstancia(ProjetilFactory.getProjetil(0), 1, 2);
        novoProjetil.renderizar();
        
    }   
}
