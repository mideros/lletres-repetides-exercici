package com.mideros.fase2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FaseDos {

	public static void main(String[] args) {
		/*FASE2:
		 * Canvia la taula per una llista (List<Character>)
		 * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
		 * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.*/
		
		String nombre="Yohanna Mid3eros GIraldo";
		List<Character> lista= new ArrayList<Character>();
		char letra;
		
		for(int i=0; i<nombre.length();i++)
		{
			lista.add(nombre.charAt(i));
			letra=lista.get(i);
			
			if((Character.isLetter(letra))||(Character.isWhitespace(letra))){
				if(esVocal(letra)){	
					System.out.println("VOCAL: "+letra);
					}else if(Character.isWhitespace(letra)) {
						System.out.println("ESPACIO EN BLANCO");
						}else{	
							System.out.println("CONSONANTE: "+letra);
						}	
			}else{
				System.out.println("El nombre no puede contener el numero: "+letra);
			}
		}
	}
		
	static boolean  esVocal(char letra){

		String letraC = Character.toString(letra);
		
	  	boolean respuesta=false;

	  	Pattern patron = Pattern.compile("[aeiouáéíóúAEIOU]");
	    Matcher mat = patron.matcher(letraC);
	     if (mat.find()) {
	         respuesta=true;
	     } else {
	         respuesta=false;
	     }
	 return respuesta;
	}
}
