package ejercicio5;

/*
Ejercicio N° 5

Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la
cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés
(double) y saldo (double). La clase contendrá los siguientes métodos: Constructor
por defecto y Constructor con todos los parámetros Constructor copia. Métodos
setters/getters para asignar y obtener los datos de la cuenta. Métodos ingreso y
reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique.
Esa cantidad no puede ser negativa. Un reintegro consiste en disminuir el saldo en
una cantidad pero antes se debe comprobar que hay saldo suficiente. La cantidad no
puede ser negativa. Los métodos ingreso y reintegro devuelve true si la operación se
ha podido realizar o false en caso contrario. Método de transferencia que permita
pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero
suficiente para poder hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe); que indica que queremos hacer
una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.
*/

public class Test {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Nicole", "123", 20, 100);
		Cuenta cuenta2 = new Cuenta("Lucas", "321", 20, 0);
		
		cuenta1.muestra(); 
		
		System.out.println(cuenta1.ingreso(200));
		cuenta1.muestra();
		
		System.out.println(cuenta1.ingreso(100));
		cuenta1.muestra();
		
		cuenta1.transferencia(cuenta2, 400);
		cuenta1.muestra();
		cuenta2.muestra();
	}

}
