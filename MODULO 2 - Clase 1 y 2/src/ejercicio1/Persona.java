package ejercicio1;

public class Persona {
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	
	//METODO CONSTRUCTOR
	public Persona() {
		
	}
	
	//METODO CONSTRUCTOR POR PARAMETROS
	public Persona (String nombre, String apellido, int dni, String domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	//METODO MUESTRA
	public void muestra() {
		//System.out.println("Nombre: " + this.nombre);
		//System.out.println("Apellido: " + this.apellido);
		System.out.println("Apellido: " + this.obtenerNombreCompleto());
		System.out.println("Dni: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
	}
	
	private String obtenerNombreCompleto(){
		return this.apellido + ", " + this.nombre;
	}

}
