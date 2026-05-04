package factorymethod;

public class Main {

    public static void main(String[] args) {
        NotificacaoFactory fabrica = new FactoryWhatsApp();
        
        fabrica.criarNotificacao().enviarNotificacao("Ola");
    }
    
}
