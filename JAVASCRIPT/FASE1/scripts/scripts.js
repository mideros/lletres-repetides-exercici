function faseUno()
{
/* FASE 1:	Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
			Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.*/

	var nombre="Yohanna";
	var letras = nombre.split("");

	for (var i = 0; i < letras.length; i++) {

		console.log(letras[i]);
	}
}