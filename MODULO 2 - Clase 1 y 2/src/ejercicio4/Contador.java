package ejercicio4;

public class Contador {
	private int cont;
	
	//CONSTRUCTOR POR DEFECTO
	public Contador() {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Contador(int cont) {
		if(cont < 0) {
			this.cont = 0;
		}
		else {
			this.cont = cont;	
		}
	}

	//CONSTRUCTOR COPIA
	public Contador(Contador contador) {
		this.cont = contador.cont;
	}
	
	//METODOS GETTER Y SETTER
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		this.setCont(this.getCont()+1);
	}
	
	public void decrementar() {
		this.setCont(this.getCont()+1);
	}
	
	public void muestra() {
		System.out.println("Cont: " + this.cont);
	}

}
