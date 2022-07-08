package ejercicio02;

/*	Ejercicio N° 2
 
	 Escriba una clase que implemente la siguiente jerarquía de clases:
	 a) Cada clase debe tener los atributos y métodos necesarios para calcular el área.
	 b) Implemente una clase principal que instancie una lista de figuras y muestre su
	 correspondiente área. */

public class Test {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[3];
		
		figuras[0] = new Cuadrado(2);
		figuras[1] = new Circulo(2);
		figuras[2] = new Triangulo(2, 4);
		
		//MUESTRA AREA
		for(int i=0; i<figuras.length; i++) {
			System.out.println("Figura " + (i+1) + ": A=" + figuras[i].calcularArea());
		}

	}

}
