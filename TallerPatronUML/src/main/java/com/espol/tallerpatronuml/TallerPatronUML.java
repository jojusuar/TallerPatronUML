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
        Notificable notificador = new TelegramNotificador(new WhatsAppNotificador(new WireNotificador(new SignalNotificador(new Notificador("Hola mundo")))));
        notificador.notificar();
    }
}
