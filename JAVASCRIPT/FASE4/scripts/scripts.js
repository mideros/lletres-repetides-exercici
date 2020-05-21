function faseCuatro()
{ 
	/*FASE 4: Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
	Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona.  
	És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
	FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]*/

	var nombre ="Yohanna";
	var apellido ="Mideros";
	var fullName =[];

	var nLetras = nombre.split("");
	var aLetras = apellido.split("");
	
	for (var i=0; i< nLetras.length;i++)
	{
		fullName.push(nLetras[i]);;
	}

	fullName.push(" ");

	for (var j = 0; j < aLetras.length; j++)
	{
		fullName.push(aLetras[j]);
	}

	console.log("FULLNAME: [ " + fullName +" ]"); 
}