/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public abstract class NotificadorDecorador implements Notificable{
    
    protected Notificable wrapee;

    public NotificadorDecorador(Notificable wrapee){
        this.wrapee = wrapee;
    } 
}
