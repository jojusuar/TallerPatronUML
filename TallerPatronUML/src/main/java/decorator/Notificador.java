/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author euclasio
 */
public class Notificador implements Notificable{
    
    private String mensaje;
    
    public Notificador(String s){
        mensaje = s;
    }

    @Override
    public void notificarPorEmail(String correo) {
        System.out.println("Notificando a "+correo);
    }

    @Override
    public void notificarPorSMS(int telefono) {
        System.out.println("Notificando a "+telefono+" por SMS");
    }
    
}
