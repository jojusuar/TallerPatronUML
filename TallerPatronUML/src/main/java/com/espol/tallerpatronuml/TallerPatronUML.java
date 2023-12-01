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
        CanalMovil canalMovil = new CanalMovil();
        CanalTelefonico canalTelefonico = new CanalTelefonico();
        CanalWeb canalWeb = new CanalWeb();
        Operador operador = new Operador("Operador1", "123456789");

        fachada.recibirConsulta();
        fachada.realizarTransaccion();

        String consultaMovil = canalMovil.recibirConsultaMovil();
        String consultaTelefonica = canalTelefonico.recibirConsultaTelefonica();
        String consultaWeb = canalWeb.recibirConsultaWeb();

        String nombreOperador = operador.getNombre();
        String rucOperador = operador.getRUC();

        System.out.println("Consulta a través de Canal Móvil: " + consultaMovil);
        System.out.println("Consulta a través de Canal Telefónico: " + consultaTelefonica);
        System.out.println("Consulta a través de Canal Web: " + consultaWeb);
        System.out.println("Nombre del operador: " + nombreOperador);
        System.out.println("RUC del operador: " + rucOperador);
    }
    
    public static void sendEverywhere(Notificador n){
        Notificable notificador = new TelegramNotificador(new WhatsAppNotificador(new WireNotificador(new SignalNotificador(n))));
        notificador.notificar();
    }
    
}
