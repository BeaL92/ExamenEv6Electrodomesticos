package com.cursoceat.model;

public class Horno extends Electrodomesticos {

	int grados;

	public Horno(String marca, double potencia, int grados) {
		super(marca, potencia);
		this.grados = grados;
	}

	public int getGrados() {
		return grados;
	}

	public void setGrados(int grados) {
		this.grados = grados;
	}

	
	@Override
	public String toString() {
		return "Horno [grados=" + grados + ", marca=" + marca + ", potencia=" + potencia + ", consumo=" + consumo
				+ ", costeConsumo=" + costeConsumo + "]";
	}
	
	
	
	

}
