
package adapter;

public abstract class AdapterDemo {
    public static void recarregarMicroUsb(Android celular){
        celular.conectarMicroUsb();
        celular.recarregar();
    }
    public static void recarregarTipoC(IOS celular){
        celular.conectarTipoC();
        celular.recarregar();
    }
    
}
