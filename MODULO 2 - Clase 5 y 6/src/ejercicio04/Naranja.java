package ejercicio04;

public class Naranja extends Fruta{

	public Naranja(double Peso) {
		super(Peso);
	}
	
	//Las naranjas dependiendo de su peso dan el 80% de jugo.
	public double hacerJugo() {
		return this.getPeso() * 0.8;
	}

}
