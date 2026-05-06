package factorymethod;
import times.FutebolTime;

public class FactoryFutebolTime extends FactoryTimes{
    @Override
    public Times criarTime(String nome, int quantidadeDeJogadores){
        return new FutebolTime(nome, quantidadeDeJogadores);
    }
}
