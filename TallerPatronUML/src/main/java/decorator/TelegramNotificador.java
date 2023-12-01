/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class TelegramNotificador extends NotificadorDecorador{
    
    public TelegramNotificador(Notificable wrapee) {
        super(wrapee);
    }
    
    public void notificarPorTelegram(int telefono){
        System.out.println("Notificando a "+telefono+" por Telegram");
    }
}
