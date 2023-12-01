/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.Tarjeta;

/**
 *
 * @author davidsuarez
 */
public class VIP extends Tarjeta {
    
    public VIP(String numero, String CVV, float limite, float costo) {
        super(numero, CVV, limite, costo);
    }
    
    @Override
    public void gastar(float cantidad) {
        //implementacion
    }
}
