package ejercicio06;

public class Taxi {
	private int id; 
	private int numTaxi;
	private int tipoTarifa;      //1 o 2
	private int precioBandera;   //58 o 70
	
	//CONSTRUCTOR POR DEFECTO
	public Taxi(){
		this.id= 0;
		this.numTaxi= 0;
		this.tipoTarifa= 1;
		this.precioBandera= 58;
	}
	
	//CONSTRUCTOR 
	public Taxi(int id, int numTaxi, int tipoTarifa) {
		this.id = id;
		this.numTaxi = numTaxi;
		this.tipoTarifa = tipoTarifa;
		if(tipoTarifa == 1)
			this.precioBandera = 58;
		else
			this.precioBandera = 70;
	}
	
	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumTaxi() {
		return numTaxi;
	}

	public void setNumTaxi(int numTaxi) {
		this.numTaxi = numTaxi;
	}

	public int getTipoTarifa() {
		return tipoTarifa;
	}

	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}

	public int getPrecioBandera() {
		return precioBandera;
	}

	public void setPrecioBandera(int precioBandera) {
		this.precioBandera = precioBandera;
	}
	
	//METODOS
	public void cambiarTarifa(){  //puedo acceder con this o setTipo porque estoy dentro de la clase, no estoy violando nada.
		if(this.tipoTarifa == 1) {
			this.tipoTarifa = 2;
			this.precioBandera = 70;
			System.out.println("CAMBIO DE TARIFA EXITOSO A TIPO DE TARIFA 2.");
		}
		else {
			this.tipoTarifa = 1;
			this.precioBandera = 58;
			System.out.println("CAMBIO DE TARIFA EXITOSO A TIPO DE TARIFA 1.");
		}
		System.out.println("**************************");	
	}

	public double calcularTotalAPagar(int metros) {
		double totalPagar= 0;
		if(this.tipoTarifa == 1)
			totalPagar= totalPagar + this.precioBandera + metros*5;			
		else
			totalPagar= totalPagar + this.precioBandera + metros*8;
		return totalPagar;
	}
	
	public void muestra() {
		 System.out.println("Id: " + this.id + "\nNumero de Taxi: " + this.numTaxi + "\nTipo de Tarifa: " + this.tipoTarifa + "\nBandera de Bajada: " + this.precioBandera);
		 System.out.println("**************************");
	}
	
}
