package facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade ht = new HomeTheaterFacade(new Filme("Lagoa Azul"), new Iluminacao(), new Som());
        
        ht.assistirFilme();
    }
}