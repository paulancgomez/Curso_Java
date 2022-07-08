package ejercicio16;

/*	Ejercicio Nro 16

	Dado un número entero expresado en base 10 devuelva su equivalente en base 2.*/

public class Test {

	public static void main(String[] args) {

	}
	
	public static int binario(int num) {
        if (num == 0 || num == 1)
            return num;
        else {
            if (num != 0) {
                int d = num % 2;
                return binario(num / 2) * 10 + d;
            } else
                return 0;
        }
    }

}
