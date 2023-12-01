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
    public void notificar() {
       System.out.println("Mensaje: "+mensaje);
       System.out.println("Notificando por correo");
       System.out.println("Notificando por SMS");
    }
    
}
