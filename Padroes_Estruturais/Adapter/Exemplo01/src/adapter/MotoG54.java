package adapter;

public class MotoG54 implements Android{
    private boolean conectado = false;
    @Override
    public void recarregar() {
        if(conectado){
            System.out.println("Carregando com MicroUsb...");
            System.out.println("Carregado!");
        }else{
            System.out.println("Conecte o carregador primeiro");
        }
    }

    @Override
    public void conectarMicroUsb() {
        if(conectado){
            System.out.println("Ja está conectado");
        }
        else{
            System.out.println("Conectado!");
            conectado = true;
        }
    }
}
