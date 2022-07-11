package supermark;

public class Categoria {
	//ATRIBUTOS
	private String nombre;
	
	//CONSTRUCTORES
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//METODOS GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
