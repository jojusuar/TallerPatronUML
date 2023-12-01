/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class SignalNotificador extends NotificadorDecorador{
    
    public SignalNotificador(Notificable wrapee) {
        super(wrapee);
    }
    
    public void notificarPorSignal(int telefono){
        System.out.println("Notificando a "+telefono+" por Signal");
    }
}
