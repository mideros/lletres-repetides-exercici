package com.mideros.fase1;

public class FaseUno {

	public static void main(String[] args) {
		/* FASE 1: 
		 * Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
		 * Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.*/
					
		String nombre="Yohanna Mideros Giraldo";
		char [] letras=nombre.toCharArray();
		
		for (int i=0; i<letras.length; i++) {
			  System.out.println("letra: " + letras[i]);
		}		
    }			
}
