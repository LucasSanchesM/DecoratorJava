package factorymethod;

public class FactorySms extends NotificacaoFactory{
    @Override
    public Notificacao criarNotificacao(){
        return new EnviarSms();
    }
}
