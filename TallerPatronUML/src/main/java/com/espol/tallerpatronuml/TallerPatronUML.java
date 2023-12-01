/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.tallerpatronuml;

import decorator.*;
/**
 *
 * @author euclasio
 */
public class TallerPatronUML {

    public static void main(String[] args) {
        //DECORATOR
        Notificador notificador = new Notificador("Hola mundo");
        sendEverywhere(notificador);
    }
    
    public static void sendEverywhere(Notificador n){
        Notificable notificador = new TelegramNotificador(new WhatsAppNotificador(new WireNotificador(new SignalNotificador(n))));
        notificador.notificar();
    }
}
