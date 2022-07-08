package clases;

import java.io.IOException;

public class ManejoDeExepciones {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 1;
			int c = a/b;  //sentencia que me va a tirar una excepcion
			System.out.println("Division: " + c);
		}
		catch(ArithmeticException e) {   //Si ocurre una excepcion aritmetica
			System.out.println("Error en la division de division:" + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error general:" + e.getMessage());
		}

		finally{
			System.out.println("Se ejecuta siempre");
			//cerrar tu flujo
		}
	}

}
