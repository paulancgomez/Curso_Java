package ejercicio01;

import java.util.Random;

public class Alumno extends Persona{
	private float[] notas; //0-10
	
	public Alumno(String nombre, String apellido, int dni, String domicilio) {
		super(nombre, apellido, dni, domicilio);
		this.notas = new float[3];
	}
	
	public void generar_nota(String materia) {
		int min=0;   //nota minima
		int max=10;  //nota maxima
		if(materia.compareTo("Matematicas") == 0) {  //son iguales
			this.notas[0] = (int) (Math.random()*(max-min+1)+min);  //casting a entero. Genero un numero aleatorio entre el min y el max
		}else if(materia.compareTo("Lengua") == 0) {
			this.notas[1] = (int) (Math.random()*(max-min+1)+min);
		}else if(materia.compareTo("Historia") == 0){
			this.notas[2] = (int) (Math.random()*(max-min+1)+min);
		}else {    //Una materia que no sea una de esas 3
			System.out.println("Materia invalida.");
		}
	}
	
	public void generar_notasEnteras() {
		int min=0;   //nota minima
		int max=10;  //nota maxima
		
		this.notas[0] = (int) (Math.random()*(max-min+1)+min);
		this.notas[1] = (int) (Math.random()*(max-min+1)+min);
		this.notas[2] = (int) (Math.random()*(max-min+1)+min);
	}

	public void generar_notasFloat() {
		Random rand = new Random();
		
		this.notas[0] = rand.nextFloat() * 10;
		this.notas[1] = rand.nextFloat() * 10;
		this.notas[2] = rand.nextFloat() * 10;
	}
	
	
	public void mostrar_notas() {
		System.out.println("Materias: [Matematicas: " + this.notas[0] + ", Lengua: "+this.notas[1] + ", Lengua: "+this.notas[2]+"]");
	}
	
	//Redefinimos el metodo de la clase padre
	public void muestra() {
		super.muestra();
		mostrar_notas();
	}

}
