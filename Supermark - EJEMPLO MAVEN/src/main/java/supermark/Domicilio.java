package supermark;

public class Domicilio {
	
	//ATRIBUTOS
	private String calle;
	private Integer numero;
	private Integer piso;
	private Integer depNumero;
	
	//CONSTRUCTORES
	public Domicilio(String calle, Integer numero, Integer piso, Integer depNumero) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depNumero = depNumero; 
	}
	
	//METODOS SET Y GET
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	
	public Integer getDepNumero() {
		return depNumero;
	}
	public void setDepNumero(Integer depNumero) {
		this.depNumero = depNumero;
	}
}
