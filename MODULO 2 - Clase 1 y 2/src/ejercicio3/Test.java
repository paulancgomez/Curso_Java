package ejercicio3;

/*
Ejercicio N° 3

Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).
Esta clase tendrá los métodos suma (), resta(), multiplicación() y división() que
recibirán como parámetros otro objeto de la misma clase NumerosEnteros.
*/

public class Test {

	public static void main(String[] args) {
		NumerosEnteros num1 = new NumerosEnteros(6);
		NumerosEnteros num2 = new NumerosEnteros(4);
		
		
		System.out.println("Suma: " + num1.suma(num2));
		System.out.println("Resta: " + num1.resta(num2));
		System.out.println("Multiplicacion: " + num1.multiplicacion(num2));
		System.out.println("Division: " + num1.division(num2));

	}

}
