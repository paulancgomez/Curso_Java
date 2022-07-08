package ejercicio17;

/*	Ejercicio Nro 17

	Dado dos números b (real) y e (entero) devolver b^e.*/

public class Test {

	public static void main(String[] args) {
		double b = 2;
		int e = 5;
		
		System.out.println(b + "^" + e + "=" + potencia(2, 5));

	}
	
	public static double potencia(double base, int exponente) {
		if(exponente==0) {
			return 1;
		}else {
			return base * potencia(base, exponente - 1);
		}
	}

}
