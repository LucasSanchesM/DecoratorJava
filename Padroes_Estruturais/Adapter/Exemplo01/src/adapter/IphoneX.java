package adapter;

public class IphoneX implements IOS{
    private boolean conectado = false;
    @Override
    public void recarregar() {
        if(conectado){
            System.out.println("Carregando com Tipo C...");
            System.out.println("Carregado!");
        }else{
            System.out.println("Conecte o carregador primeiro");
        }
    }

    @Override
    public void conectarTipoC() {
        if(conectado){
            System.out.println("Ja está conectado");
        }
        else{
            System.out.println("Conectado!");
            conectado = true;
        }
    }
    
}
