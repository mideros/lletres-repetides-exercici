package com.mideros.fase4;

import java.util.ArrayList;
import java.util.List;


public class FaseCuatro {

	public static void main(String[] args) {
		/*FASE 4:
		 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
		 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
		 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]*/
		
		String nombre= "Yohanna";
		String apellido= "Mideros";
		List<String> fullName = new ArrayList<String>();
		
		String [] nLetras=nombre.split("");
		String [] aLetras=apellido.split("");
		String c=" ";
		String b=" ";
		    
		for(String i:nLetras)
		{
			c=i;
			fullName.add(c);			
		}
		fullName.add(b);
		
		for(String j:aLetras)
		{
			c=j;
			fullName.add(c);			
		}
		
		System.out.print("FULLNAME: " +fullName); 

	}
}
