package ejercicio03;

/*	Ejercicio N° 3

	Dado el siguiente código:
	Sabemos que existe una clase TCredito con 5 atributos y 8 métodos. Además existe
	la clase Tarjeta la cual tiene un main. Responda a los siguientes incisos:
		a) JPTarjeta y DMTarjeta son dos nuevas clases?. Sino es así ¿que son?
		b) JPTarjeta.muestraDatos() ¿qué hace?
		c) Mejore el método muestraDatos() para mostrar toda la información
		disponible.
		d) Modifique el main de Tarjeta para probar si JPTarjeta puede comprarse una
		Ultrabook de $16000. Si no es posible, mostrar un mensaje en pantalla.
		e) No estaría de más tener un método que permita aumentarBalance, ¿no?
		f) A DMTarjeta le informaron que debe pagar su tarjeta. Pero sólo pagará
		$1500. Realice el pago y muestre la información actualizada de DMTarjeta.*/

public class Tarjeta {

	public static void main(String[] args) {

		/* a): JPTarjeta y DMTarjeta no son dos nuevas clases, son dos objetos de la misma clase
		  con valores de los atributos distintos*/
		TCredito JPTarjeta = new TCredito("666","JPerez","BcoPatagonia",2000,10000);
		TCredito DMTarjeta = new TCredito("777","DMartin","BcoGalicia",5000,10000);
		
		
		// b) JPTarjeta.muestraDatos() muestra el numero y nombre del objeto JPTarjeta: 666, JPerez
		JPTarjeta.muestraDatos();
		
		
		//c) Mejore el método muestraDatos() para mostrar toda la información disponible.
		JPTarjeta.muestraDatosMejorado();
		
		
		/*d) Modifique el main de Tarjeta para probar si JPTarjeta puede comprarse una
		Ultrabook de $16000. Si no es posible, mostrar un mensaje en pantalla.*/
		if(JPTarjeta.puedoComprar(16000)) {
			System.out.println("JPTarjeta si puede comprarse una Ultrabook de $16000");
		}
		else {
			System.out.println("JPTarjeta NO puede comprarse una Ultrabook de $16000");
		}
		
		//e) No estaría de más tener un método que permita aumentarBalance, ¿no?
		JPTarjeta.aumentarBalance(200);
		
		
		/*f) A DMTarjeta le informaron que debe pagar su tarjeta. Pero sólo pagará
		$1500. Realice el pago y muestre la información actualizada de DMTarjeta.*/
		DMTarjeta.pagarTarjeta(1500);
		DMTarjeta.muestraDatosMejorado();

	}

}
