package com.cursoceat.model;



public class Electrodomesticos {
	public enum tipo {LAVADORA,HORNO,NEVERA}
	String marca;
	public double potencia;
	public double consumo;
	public double costeConsumo;
	
	public Electrodomesticos() {
		
	}
	public Electrodomesticos(String marca, double potencia) {
		this.marca = marca;
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
	public double getConsumo(int horas) {
     double kWh= (potencia*horas);
		
		return consumo;
	}
	public double getCosteConsumo(int horas, double costeHora) {
		 costeHora= 0.132;
		 double costeConsumo=costeHora*(potencia*horas);
		
		return costeConsumo;
	}
		
	@Override
	public String toString() {
		return "Electrodomesticos [marca=" + marca + ", potencia=" + potencia + ", consumo=" + consumo
				+ ", costeConsumo=" + costeConsumo + "]";
	}
		
		
	
	

}
