package ejercicio2;

public class Serie {
	private String titulo;
	private int numTemporadas;
	private String genero;
	private String creador;

	//CONSTRUCTOR POR DEFECTO
	public Serie() {
		
	}
	
	//CONSTRUCTOR COMUN
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//GET Y SET
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	//METODOS
	public void modifica(String titulo, int numTemporadas, String genero, String creador) {
		this.setTitulo(titulo);
		this.setNumTemporadas(numTemporadas);
		this.setGenero(genero);
		this.setCreador(creador);
	}
	
	public void muestra() {
		System.out.println("Titulo: "+ this.titulo + 
				"\nNumero de Temporadas: " + this.numTemporadas + 
				"\nGenero: "+ this.genero + 
				"\nCreador: " + this.creador);
	}

}