package Actividades;

public class Automovil {
	private String placa;
	private int numPuertas;
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Automovil(String placa, int numPuertas, String marca, String modelo) {
		this.placa = placa;
		this.numPuertas = numPuertas;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//GET
	public String getplaca() {return placa;}
	public int getnumPuertas() {return numPuertas;}
	public String getmarca() {return marca;}
	public String getmodelo() {return modelo;}
	
	//SET
	public void setplaca(String placa) {this.placa = placa;}
	public void setnumPuertas(int numPuertas) {this.numPuertas = numPuertas;}
	public void setmarca(String marca) {this.marca = marca;}
	public void setmodelo(String modelo) {this.modelo = modelo;}
	
	@Override
    public String toString() {
        return "Automovil [placa=" + placa + ", numPuertas=" + numPuertas + 
               ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
    }
}
