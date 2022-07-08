package ejercicio01;

/*	Ejercicio No 1
 
	Usando la clase “PERSONAS” (práctico N°2 - Clase 1 ejercicio nro 1). Crear una clase
	“Alumnos” que herede los atributos y métodos de “PERSONAS” y agregar los siguientes:
	● Atributo notas: array de notas (matemática, lengua, historia).
	● Métodos:
	○ constructor (se deben pasar los parámetros del alumno)
	○ generar_notas(): se generan de forma aleatoria
	○ mostrar_notas(): muestra las notas del alumno */

public class Test {

	public static void main(String[] args) {
		Alumno alumna = new Alumno("Pau", "Gomez", 123, "Salta");
		Alumno alumna2 = new Alumno("Olivia", "Gomez", 222, "Salta"); 
		
		alumna.mostrar_notas(); //todavia no genere nada.
		
		alumna.generar_nota("Matematicas");
		alumna.generar_nota("Lengua");
		alumna.generar_nota("Historia");
		alumna.mostrar_notas();
		
		alumna2.generar_notasFloat();
		alumna2.mostrar_notas();

	}

}
