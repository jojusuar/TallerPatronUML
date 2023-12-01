/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author davidsuarez
 */
public abstract class Tarjeta {
    public String numero;
    public String CVV;
    public float limite;
    public float costo;
    
    public Tarjeta(String numero, String CVV, float limite, float costo) {
        this.numero = numero;
        this.CVV = CVV;
        this.limite = limite;
        this.costo = costo;
    }
    
    public abstract void gastar(float cantidad);
}
