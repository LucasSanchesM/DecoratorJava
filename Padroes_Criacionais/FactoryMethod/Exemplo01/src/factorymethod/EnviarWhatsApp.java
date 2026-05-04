package factorymethod;

public class EnviarWhatsApp implements Notificacao{
    
    public void enviarNotificacao(String mensagem){
        System.out.println("Enviando via whatsapp: " + mensagem);
    }
    
}
