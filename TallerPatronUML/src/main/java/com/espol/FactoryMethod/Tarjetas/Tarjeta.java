package com.espol.FactoryMethod.Tarjetas;

public abstract class Tarjeta {
	public String numero;
	public String CCV;
	public float limite;
	public float costo;
	public abstract void gastar(float a);
}
