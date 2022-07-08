package ejercicio04;

public class Manzana extends Fruta{

	public Manzana(double Peso) {
		super(Peso);
	}
	
	//Las manzanas dependiendo de su peso dan el 30% de jugo.
	public double hacerJugo() {
		return this.getPeso() * 0.3;
	}

}
