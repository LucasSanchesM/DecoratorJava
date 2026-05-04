package exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        Player player = new Player.Builder()
                .setNickname("Joao")
                .setArma("Espada")
                .setClasse("Guerreiro")
                .setVida(100)
                .setNivel(1)
                .setMana(200)
                .Builder();
        
        System.out.println(player);
    }    
}
