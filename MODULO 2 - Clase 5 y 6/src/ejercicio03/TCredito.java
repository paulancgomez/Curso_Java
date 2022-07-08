package ejercicio03;

public class TCredito {

	private String numero;
	private String nombre;
	private String banco;
	private double balance;
	private double limite;
	
	public TCredito(String vnumero, String vnombre, String vbanco, double vbalance, double vlimite){
		numero=vnumero;
		nombre=vnombre;
		banco=vbanco;
		balance=vbalance;
		limite=vlimite;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getBanco(){
		return banco;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getLimite(){
		return limite;
	}

	public boolean puedoComprar(double vprecio){
		if (vprecio+balance>limite){
			return false;
		}
		else{
			balance+=vprecio;
			return true;
		}
	}
	
	public void pagarTarjeta(double vmonto){
		balance-=vmonto;
	}
	
	public void muestraDatos(){
		System.out.println("numero = "+getNumero());
		System.out.println("nombre = "+getNombre());
	}
	
	//c) Mejore el método muestraDatos() para mostrar toda la información disponible.
	public void muestraDatosMejorado(){
		System.out.println("Numero = "+getNumero());
		System.out.println("Nombre = "+getNombre());
		System.out.println("Banco = "+getBanco());
		System.out.println("Balance = "+getBalance());
		System.out.println("Limite = "+getLimite());
	}
	
	//e) No estaría de más tener un método que permita aumentarBalance, ¿no?
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void aumentarBalance(double aumento) {
		this.setBalance(this.balance+aumento);
	}

}
