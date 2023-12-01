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
        int miTelefono = 991096645; 
        Notificable notificador = new Notificador("Hola mundo");
        
        WhatsAppNotificador notificadorW = new WhatsAppNotificador(notificador);
        notificadorW.notificarPorEmail("jojusuar@espol.edu.ec");
        notificadorW.notificarPorSMS(miTelefono);
        notificadorW.notificarPorWhatsApp(miTelefono);
        
        SignalNotificador notificadorS = new SignalNotificador(notificador);
        notificadorS.notificarPorEmail("jojusuar@espol.edu.ec");
        notificadorS.notificarPorSMS(miTelefono);
        notificadorS.notificarPorSignal(miTelefono);
    }
}
