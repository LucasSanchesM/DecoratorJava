package factorymethod;
import times.BasqueteTime;

public class FactoryBasqueteTime extends FactoryTimes{
    @Override
    public Times criarTime(String nome,int quantidadeDeJogadores){
        return new BasqueteTime(nome, quantidadeDeJogadores);
    }
}
