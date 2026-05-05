/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author lucas
 */
public class IOSToAndroidAdapter implements Android{
    private final IOS ios;

    public IOSToAndroidAdapter(IOS ios){
        this.ios = ios;
    }
    
    @Override
    public void recarregar() {
        ios.recarregar();
    }

    @Override
    public void conectarMicroUsb() {
        System.out.println("Micro Usb conectado");
        ios.conectarTipoC();
    }
}
