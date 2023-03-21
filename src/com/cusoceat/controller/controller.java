package com.cusoceat.controller;


import com.cursoceat.model.Horno;
import com.cursoceat.model.Lavadora;
import com.cursoceat.model.Nevera;

public class controller {
	public static void main(String[] args) {
		Lavadora miLavadora=new Lavadora("AEG", 1.500, 500, true);
		System.out.println(miLavadora);
		System.out.println(miLavadora.getConsumo(10));
		System.out.println(miLavadora.getCosteConsumo(10, 0.135));
		
		Horno miHorno=new Horno("Balay", 2.200, 220);
		System.out.println(miHorno);
		System.out.println(miHorno.getConsumo(10));
		System.out.println(miHorno.getCosteConsumo(10, 0.135));
		
		Nevera miNevera=new Nevera("Balay", 0.350, 4);
		System.out.println(miNevera);
		System.out.println(miNevera.getConsumo(10));
		System.out.println(miNevera.getCosteConsumo(10, 0.135));
		
	}
}


