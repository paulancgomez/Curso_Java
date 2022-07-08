package ejercicio04;

public class Pera extends Fruta{

	public Pera(double Peso) {
		super(Peso);
	}
	
	//Las naranjas dependiendo de su peso dan el 60% de jugo.
		public double hacerJugo() {
			return this.getPeso() * 0.6;
		}


}
