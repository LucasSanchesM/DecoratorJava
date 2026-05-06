package factorymethod;

public class Main {

    public static void main(String[] args) {
        FactoryTimes fabricaTime = new FactoryFutebolTime();
        Times timeFutebol = fabricaTime.criarTime("Barcelona", 11);
        
        FactoryTimes fabricaTime2 = new FactoryBasqueteTime();
        Times timeBasquete = fabricaTime2.criarTime("Golden State Warriors", 5);
        
        System.out.println(timeBasquete.getNome()+ " - " + timeBasquete.getQuantidadeDeJogadores());
        System.out.println(timeFutebol.getNome()+ " - " + timeFutebol.getQuantidadeDeJogadores());
    }
    
}
