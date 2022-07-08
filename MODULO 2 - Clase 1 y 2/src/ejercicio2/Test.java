package ejercicio2;

/*
Ejercicio N° 2

Crear una clase llamada serie con los atributos: titulo, números de temporadas,
género y creador. Con los siguientes métodos: Constructor, mostrar todos los
atributos, sobrescribir todos los atributos.
*/

public class Test {

	public static void main(String[] args) {
		Serie serie = new Serie("Grey's Anatomy", 16, "Drama","Shonda");
		
		serie.muestra();
		
		serie.modifica("Las Estrellas", 1, "Drama - Comedia", "Adrian Suar");
		serie.muestra();

	}

}
