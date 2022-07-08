package ejercicio03;

import clases.Persona;

public class Empleado {
	
	Persona titular;
	double sueldoBasico;
	
	public Empleado(Persona titular, double sueldoBasico) {
		this.titular = titular;
		this.sueldoBasico = sueldoBasico;
	}

	public Persona getTitular() {
		return titular;
	}
	
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public double calculoSueldo(int horas){
		return this.sueldoBasico * horas;
	}
	
	public void verEmpleado(){
		this.titular.muestra();
		System.out.println("Sueldo Basico: " + this.sueldoBasico);
	}

}
