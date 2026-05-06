package facade;

public class HomeTheaterFacade {
    private Filme filme;
    private Iluminacao iluminacao;
    private Som som;
    
    public HomeTheaterFacade(Filme f, Iluminacao i, Som v){
        this.filme = f;
        this.iluminacao = i;
        this.som = v;
    }
    
    public void assistirFilme(){
        System.out.println("Ajustando Parametros...");
        som.ligarSom();
        iluminacao.ativarIluminacaoCinematografica();
        System.out.println("Bom filme!");
        filme.reproduzirFilme();
    }
}