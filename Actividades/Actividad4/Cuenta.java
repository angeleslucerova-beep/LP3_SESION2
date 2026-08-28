package Actividades;

public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Cuenta(int numero) {
		this(numero,0);
	}
	
	//GET
	public int numero() {return numero;}
	public double saldo() {return saldo;}
	
	//SET
	public void setnumero(int numero) {this.numero = numero;}
	public void setsaldo(double saldo) {this.saldo = saldo;}
	
	@Override
	public String toString() {
		return "Cuenta:[Numero:"+numero+"/"+"Saldo:"+saldo+"]";
	}
}
