package facade;

public class Filme {
    private String nome;
    
    public Filme(String nome){
        this.nome = nome;
    }
    public void  trocarFilme(String nomeDoNovoFilme){
        this.nome = nomeDoNovoFilme;
    }
    public String verFilmeAtual(){
        return "Filme Atual: "+this.nome;
    }
    public void reproduzirFilme(){
        System.out.println("Reproduzindo filme...");
    }
}
