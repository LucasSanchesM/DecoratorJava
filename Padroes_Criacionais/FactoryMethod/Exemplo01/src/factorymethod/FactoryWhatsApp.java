package factorymethod;

public class FactoryWhatsApp extends NotificacaoFactory{
    @Override
    public Notificacao criarNotificacao(){
        return new EnviarWhatsApp();
    }
}
