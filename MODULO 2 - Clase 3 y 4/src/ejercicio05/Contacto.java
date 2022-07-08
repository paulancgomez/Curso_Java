package ejercicio05;

public class Contacto {
	//ATRIBUTOS
	String nombre;
	String numTelefono;
	
	//CONTRUCTOR
	public Contacto(String nombre, String numTelefono) {
		this.nombre = nombre;
		this.numTelefono = numTelefono;
	}

	//GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	//METODOS
	public boolean iguales(Contacto c2){
		return this.nombre.equals(c2.getNombre()); //podria hacer c2.getNombre() que tambien es valido pero no hace falta porque con c2.nombre no estoy violando encapsulamiento ya que los atributos son privados para la misma clase. Afuera de la clase es necesario el uso de los get
	}
	
	@Override                     //La anotación implemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método, y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
	public String toString() {    //Metodo heredado del Meta Clase: Object
		return "Nombre: " + this.nombre + "\nNumero de Telefono: " + this.numTelefono;
	}

}
