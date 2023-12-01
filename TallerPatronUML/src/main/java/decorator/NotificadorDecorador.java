/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class NotificadorDecorador implements Notificable{
    
    private Notificable wrapee;

    public NotificadorDecorador(Notificable wrapee){
        this.wrapee = wrapee;
    }
    
    @Override
    public void notificarPorEmail(String correo) {
        System.out.println("Notificando a "+correo);
    }

    @Override
    public void notificarPorSMS(int telefono) {
        System.out.println("Notificando a "+telefono+" por SMS");
    }
    
}
