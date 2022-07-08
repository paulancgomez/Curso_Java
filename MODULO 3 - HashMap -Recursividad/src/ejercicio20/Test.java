package ejercicio20;

/*	Ejercicio Nro 20

	Implementar la serie de Fibonacci
	Ejemplo:
	Fibo(0) = 0
	Fibo(1) = 1
	Fibo(2) = 0 + 1 = 1
	Fibo(3) = 1 + 2 = 3
	Fibo(4) = 2 + 3 = 5
	Fibo(n) = (n-1) + (n-2)*/

public class Test {

	public static void main(String[] args) {
		

	}
	
	public static int fibonacci(int n) {
    	if(n==0 || n==1) {
    		return n;
    	}
    	else return fibonacci(n-1)+fibonacci(n-2);
    }

}
