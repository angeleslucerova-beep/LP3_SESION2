package Actividades;

public class Cuenta1 {
	    protected int numero;
	    protected double saldo;
	    
	    public Cuenta1(int numero) {
	        this.numero = numero;
	        this.saldo = 0;
	    }
	    
	    public Cuenta1(int numero, double saldo) {
	        this.numero = numero;
	        this.saldo = saldo;
	    }
	    
	    public void depositar(double monto) {
	        saldo += monto;
	    }
	    
	    public void retirar(double monto) {
	        saldo -= monto;
	    }
	    
	    public void consultar() {}
	    
	    public double getSaldo() {
	        return saldo;
	   }
	    
	    public int getNumero() {
	        return numero;
	    }
	    
	    @Override
	    public String toString() {
	        return "Cuenta1 [numero=" + numero + ", saldo=" + saldo + "]";
	    }
	}

