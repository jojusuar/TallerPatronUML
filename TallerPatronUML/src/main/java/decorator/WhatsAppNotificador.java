/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class WhatsAppNotificador extends NotificadorDecorador{
    
    public WhatsAppNotificador(Notificable wrapee) {
        super(wrapee);
    }

    @Override
    public void notificar() {
        wrapee.notificar();
        System.out.println("Notificando por WhatsApp");
    }
    
    
}
