package factorymethod;

public class EnviarSms implements Notificacao{
    public void enviarNotificacao(String mensagem){
        System.out.println("Enviando via sms: " + mensagem);
    }
}
