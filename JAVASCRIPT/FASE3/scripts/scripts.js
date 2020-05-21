function faseTres()
{
/* FASE 3: Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen*/

	var nombre = "Yohanna";
	var mapa = new Map();
	var caracter = "";

	for (var i = 0; i < nombre.length; i++) {
	
		caracter = nombre.charAt(i);
			if (!mapa.has(caracter)) {
				mapa.set(caracter, 1);
			} else{
				mapa.set(caracter, mapa.get(caracter) + 1);
			}
	}
	console.log(mapa);
}	