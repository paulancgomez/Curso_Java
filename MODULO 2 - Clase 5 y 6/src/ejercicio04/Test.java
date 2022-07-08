package ejercicio04;

/*	Ejercicio N° 4
	
	Dado el siguiente código: Teniendo una superclase Fruta, con un atributo peso,y un
	método hacerJugo(). De dicha clase extienden otras tres clases llamadas Manzana,
	Naranja y Pera.
	Se sabe que: Las manzanas dependiendo de su peso dan el 30% de jugo. Las
	Naranjas el 80% Y las peras el 60%
	En una clase Test crear una colección de Frutas aleatorias (Manzana, Naranja, Pera)
	y mostrar la cantidad de jugo obtenido.*/

public class Test {

	public static void main(String[] args) {
		Fruta[] frutas = new Fruta[3];
		double cantidadJugo = 0;
		
		frutas[0] = new Manzana(300);
		frutas[1] = new Naranja(200);
		frutas[2] = new Pera(150);
		
		for(int i=0; i<frutas.length; i++) {
			cantidadJugo = cantidadJugo + frutas[i].hacerJugo();
		}
		
		System.out.println("La cantiad de jugo obtenido es: " + cantidadJugo);
	
	}

}
