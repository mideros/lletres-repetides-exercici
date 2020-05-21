package com.mideros.fase3;

import java.util.HashMap;

public class FaseTres {

	public static void main(String[] args) {
		/* FASE 3:
		 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen*/
			
		String nombre= "Yohanna";	
		
		HashMap<Character, Integer> letras= new HashMap<Character,Integer>();
		
		char c=' ';
		
		for(int i=0; i<nombre.length();i++) {
			
			c=nombre.charAt(i);
			
			if(!letras.containsKey(c))
			{
				letras.put(c, 1);
			}else {
				letras.put(c,letras.get(c)+1);
			}
		}		
		System.out.println(letras);				
	}
}
