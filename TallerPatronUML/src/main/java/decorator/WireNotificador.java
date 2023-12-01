/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class WireNotificador extends NotificadorDecorador{
    
    public WireNotificador(Notificable wrapee) {
        super(wrapee);
    }
    
    public void notificarPorWire(int telefono){
        System.out.println("Notificando a "+telefono+" por Wire");
    }
}
