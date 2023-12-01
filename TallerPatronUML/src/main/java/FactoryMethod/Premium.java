/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author davidsuarez
 */
public class Premium extends Tarjeta {
    
    public Premium(String numero, String CVV, float limite, float costo) {
        super(numero, CVV, limite, costo);
    }
    
    @Override
    public void gastar(float cantidad) {
        //implementacion
    }
}
