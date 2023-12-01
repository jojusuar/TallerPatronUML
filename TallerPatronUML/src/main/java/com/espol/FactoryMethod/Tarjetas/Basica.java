package com.espol.FactoryMethod.Tarjetas;

public class Basica extends Tarjeta{

	@Override
	public void gastar(float a) {
		System.out.println("Gastaste "+a+" usando la tarjeta básica");
	}
	
}
