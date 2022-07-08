package ejercicio18;

/*	Ejercicio Nro 18
	
	Implementar la función factorial.
	Ejemplo:
	Fac(0) = 1
	Fac(1) = 1 = 1
	Fac(2)= 2 x 1 = 2
	Fac(3)= 3 x 2 x 1 = 6
	Fac(4)= 4 x 3 x 2 x 1 = 24
	Fac(n)= n x (n-1) x (n-2) x ... x 1*/

public class Test {

	public static void main(String[] args) {

	}
	
	public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
