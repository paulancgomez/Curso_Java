package ejercicio02;
import clases.Persona;

/*  Ejercicio N° 2

	Crear una clase llamada Cuenta que tendrá los atributos: titular (que es una persona)
	y cantidad (puede tener decimales). El titular será obligatorio y la cantidad es
	opcional. Construye los siguientes métodos para la clase:
		● Un constructor;
		● mostrar(): Muestra los datos de la cuenta;
		● ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad
		introducida es negativa, no se hará nada;
		● retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en
		números rojos.*/

public class Test {

	public static void main(String[] args) {
		Persona miPersona = new Persona("Nicole", "Gomez", 1234, "Salta");
		Cuenta miCuenta = new Cuenta(miPersona, 1000);
		
		miCuenta.mostrar();

		miCuenta.ingresar(-500);
		
		miCuenta.ingresar(500);
		miCuenta.mostrar();
		
		miCuenta.retirar(200);
		miCuenta.mostrar();

	}

}
