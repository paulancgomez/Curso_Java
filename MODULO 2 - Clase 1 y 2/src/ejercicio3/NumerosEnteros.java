package ejercicio3;

public class NumerosEnteros {
	private int numero;
	
	//CONSTRUCTOR
	public NumerosEnteros() {
			
	}
	
	//CONSTRUCTOR COMUN
    public NumerosEnteros(int numero) {
		this.numero = numero;
    }
    
    //GET Y SET
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//METODOS REDEFINIDOS
	public int suma(NumerosEnteros numero2) {
		return this.numero + numero2.getNumero();
	}
	
	public int resta(NumerosEnteros numero2) {
		return this.numero - numero2.getNumero();
	}
	
	public int multiplicacion(NumerosEnteros numero2) {
		return this.numero * numero2.getNumero();
	}
	
	public int division(NumerosEnteros numero2) {
		return this.numero / numero2.getNumero();
	}
	
	public float divisionFloat(NumerosEnteros numero2) {
		if(numero2.getNumero() == 0) {
			System.out.println("Error. Division por cero.");
			return -1;
		}
		else
		    return (float)(this.numero / numero2.getNumero());  //casteo a float
	}
}