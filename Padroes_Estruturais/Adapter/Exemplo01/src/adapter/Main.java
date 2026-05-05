package adapter;

public class Main {

    public static void main(String[] args) {
        IphoneX celular1 = new IphoneX();
        MotoG54 celular2 = new MotoG54();
        
        AdapterDemo.recarregarTipoC(celular1);
        System.out.println("\n");
        AdapterDemo.recarregarMicroUsb(celular2);
        System.out.println("\n");

        IphoneX celular3 = new IphoneX();
        AdapterDemo.recarregarMicroUsb(new IOSToAndroidAdapter(celular3));
        
    }
    
}
