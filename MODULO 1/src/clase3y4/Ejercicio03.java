package clase3y4;
 
/* EJERCICIO 3: Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el menor.
*/

public class Ejercicio03 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int menor, mayor;
	
		num1 = 100;
		num2 = 30;
		num3 = 50;
		
		if(num1<num2 && num2<num3) {
			menor=num1;
			mayor=num3;
		}
		else if(num3<num2 && num2<num1) {
			menor=num3;
			mayor=num1;
		}
		else if(num2<num1 && num1<num3) {
			menor=num2;
			mayor=num3;
		}
		else {
			menor=num3;
			mayor=num2;
		}
		
		System.out.println("Menor: "+ menor);
		System.out.println("Mayor: "+ mayor);

	}

}
