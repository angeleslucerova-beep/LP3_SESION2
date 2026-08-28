package Actividades;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = new Cuenta(1);
	}
	
	//GET
	public int getid() {return id;}
	public String getnombre() {return nombre;}
	public String getapellido() {return apellido;}
	public Cuenta getcuenta() {return cuenta;}
	
	//SET
	public void setid(int id) {this.id = id;}
	public void setnombre(String nombre) {this.nombre=nombre;}
	public void setapellido(String apellido) {this.apellido = apellido;}
	public void setcuenta(Cuenta cuenta) {this.cuenta = cuenta;}
	
	@Override
	public String toString() {
		return "Persona [id ="+id+"/"+"Nombre="+nombre+"/"+"Apellido:"+apellido+"Cuenta:"+cuenta+"]";
	}
	
}
