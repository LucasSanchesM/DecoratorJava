package flyweight;

import frames.Projetil;

public abstract class ProjetilFactory {
    public static final int BALA = 0;
    public static final int GRANADA = 1;
    
    private static Projetil[] projeteis = new Projetil[2];
    
    public static Projetil getProjetil(int tipo){
        if(projeteis[tipo] == null){
            if(tipo == BALA){
                System.out.println("Criando modelo de bala");
                projeteis[tipo] = new Projetil("Cinetico Solido (Bala)", "Cinza", 20);
            }
            else if(tipo == GRANADA){
                projeteis[tipo] = new Projetil("Explosivo (Granada)", "Verde", 60);
            }
        }
        return projeteis[tipo];
    }
    
}
