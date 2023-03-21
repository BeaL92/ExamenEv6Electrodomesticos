package com.cursoceat.model;

public class Nevera extends Electrodomesticos {

	int temperatura;

	public Nevera(String marca, double potencia, int temperatura) {
		super(marca, potencia);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Nevera [temperatura=" + temperatura + ", marca=" + marca + ", potencia=" + potencia + ", consumo="
				+ consumo + ", costeConsumo=" + costeConsumo + "]";
	}
	

}
