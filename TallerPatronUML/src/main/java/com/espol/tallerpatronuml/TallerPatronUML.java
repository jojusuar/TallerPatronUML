/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.tallerpatronuml;

import FacadeMethod.AtencionVirtualFachada;
import FacadeMethod.CanalMovil;
import FacadeMethod.CanalTelefonico;
import FacadeMethod.CanalWeb;
import FacadeMethod.Operador;
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
        
        //FACADE
        AtencionVirtualFachada fachada = new AtencionVirtualFachada("https://subcanales.com");
        Operador operador = new Operador("Operador1", "123456789");
        fachada.recibirConsulta();
        fachada.realizarTransaccion();
    }
    
    public static void sendEverywhere(Notificador n){
        Notificable notificador = new TelegramNotificador(new WhatsAppNotificador(new WireNotificador(new SignalNotificador(n))));
        notificador.notificar();
    }
    
}
