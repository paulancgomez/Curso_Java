package ejercicio01;

/*  Ejercicio N° 1

	Vamos a realizar una clase llamada Raíces, donde representaremos los valores de
	una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos,
	llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto.
	Las operaciones que se podrán hacer son las siguientes:
		● obtenerRaices(): imprime las 2 posibles soluciones
		● obtenerRaiz(): imprime una única raíz, que será cuando solo tenga una
		solución posible.
		● getDiscriminante(): devuelve el valor del discriminante (double), el
		discriminante tiene la siguiente fórmula, (b^2)-4ac
		● tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
		que esto ocurra, el discriminante debe ser mayor o igual que 0.
		● tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
		que esto ocurra, el discriminante debe ser igual que 0.
		● calcular(): mostrará por consola las posibles soluciones que tiene nuestra
		ecuación, en caso de no existir solución, mostrarlo también.
	Fórmula ecuación 2o grado: (-b±√((b^2)-(4ac)))/(2*a)
	Solo varía el signo delante de -b*/

public class Test {

	public static void main(String[] args) {
		
		Raices miRaices = new Raices(3, 2, 7);
		miRaices.calcular();
	}

}
