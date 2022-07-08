package clases;

public class Persona {
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
		
	//METODO CONSTRUCTOR POR DEFECTO
	public Persona() {
			
	}
	
	//METODO CONSTRUCTOR COMUN
	public Persona (String nombre, String apellido, int dni, String domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
		
	//METODO MUESTRA
	public void muestra() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Dni: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
	}
}
