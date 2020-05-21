function faseDos()
{
/*FASE2:
Canvia la taula per una llista (List<Character>)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.*/

var nombre="Yohann3a";
var lista=[];
var numero = /[0-9]$/;
var patron = /[aeiouAEIOUáéíóú]$/;
var mensaje=" ";

	for (var i = 0; i < nombre.length; i++)
	{
		lista.push(nombre.charAt(i));
		
		if(numero.test(lista[i])){			
			mensaje = mensaje + "<p>" + "El nombre no puede contener números " + lista[i] + "</p>";
			document.getElementById("lista").innerHTML = mensaje;
		}else if(patron.test(lista[i])){
				mensaje = mensaje + "<p>" + "VOCAL: " + lista[i] + "</p>";
				document.getElementById("lista").innerHTML = mensaje;
			}else if(lista[i]==" "){
					mensaje = mensaje + "<p>"+ "ESPACIO EN BLANCO "+ "</p>";
					document.getElementById("lista").innerHTML = mensaje;
				}else{
					mensaje = mensaje + "<p>" + "CONSONANTE: " + lista[i] + "</p>";
					document.getElementById("lista").innerHTML = mensaje;
				}		
	}		
}