package com.cursoceat.model;

public class Lavadora extends Electrodomesticos {
	
	
	double precio;
	boolean aguaCaliente;;
	public Lavadora(String marca, double potencia) {
		if (aguaCaliente=true) {
			System.out.println("Agua caliente");
		}else {
			System.out.println("Agua fría");
		}
	
	}
	public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
		super(marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean getAguaCaliente() {
		return aguaCaliente;
	}
	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	@Override
	public String toString() {
		return "Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + ", marca=" + marca + ", potencia="
				+ potencia + ", consumo=" + consumo + ", costeConsumo=" + costeConsumo + "]";

	
	}
	
	

}
