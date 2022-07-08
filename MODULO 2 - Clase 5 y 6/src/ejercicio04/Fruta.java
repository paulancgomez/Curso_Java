package ejercicio04;

public class Fruta {
	private double peso;
    
	public Fruta(double Peso) {
		this.setPeso(Peso);
    }
 
	public double getPeso() {
		return peso;
	}
 
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double hacerJugo() {
		return 0;
	}

}