package times;
import factorymethod.Times;

public class BasqueteTime implements Times{
    private final String nome;
    private final int quantidadeDeJogadores;

    public BasqueteTime(String nome, int quantidadeDeJogadores){
        this.nome = nome;
        this.quantidadeDeJogadores = quantidadeDeJogadores;
    }
    
    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }
}
