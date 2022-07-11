package supermark;

public class Persona {

	//ATRIBUTOS
	private String nombre;
	private String apellido;
	
	//CONSTRUCTORES
	
	//CONSTRUCTOR POR DEFECTO
	public Persona() {
		
	}
	
	//CONSTRUCTOR DE COPIA
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
	}
	
	//CONSTRUCTOR COMUN
	public Persona(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

}