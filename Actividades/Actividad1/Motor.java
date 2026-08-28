package Actividades;

public class Motor {
	private int numMotor;
	private int revolucionesPorMin;
	
	public Motor(int numMotor, int revolucionesPorMin) {
		this.numMotor = numMotor;
		this.revolucionesPorMin = revolucionesPorMin;
	}
	
	//GET
	public int getnumMotor() {return numMotor; }
	public int revolucionesPorMi() {return revolucionesPorMin;}
	
	//SET
	public void setnumMotor(int numMotor) {this.numMotor = numMotor;}
	public void setrevolucionesPorMin(int revolucionesPorMin) {this.revolucionesPorMin = revolucionesPorMin;}
	
	@Override
    public String toString() {
        return "Motor [numMotor=" + numMotor + ", revolucionesPorMin=" + revolucionesPorMin + "]";
    }
}
