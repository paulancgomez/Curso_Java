package ejercicio03;

/*	Ejercicio N° 3:
    
    Usando la clase persona del ejercicio 1 crear una clase empleado que deberá tener
	el atributo sueldo básico. Implementar los métodos:
		● calculoSueldo(): este se calcula como la cantidad de horas trabajadas por el
		sueldo básico
		● verEmpleado(): visualiza los datos del empleado.*/

import clases.Persona;

public class Test {

	public static void main(String[] args) {
		Persona miPersona = new Persona("Nicole", "Gomez", 12345, "Salta");
		Empleado miEmpleado = new Empleado(miPersona, 200);
		double sueldoTotal;
		
		miEmpleado.verEmpleado();
		sueldoTotal = miEmpleado.calculoSueldo(3);
		System.out.println("El sueldo total por las horas trabajadas es: " + sueldoTotal);

	}

}
