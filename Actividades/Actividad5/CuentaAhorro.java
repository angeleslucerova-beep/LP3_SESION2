package Actividades;

public class CuentaAhorro extends Cuenta1 {
    private double tasaInteres;
    private double saldoMinimo;
    
    public CuentaAhorro(int numero) {
        super(numero);
        this.tasaInteres = 0.02; // 2% por defecto
        this.saldoMinimo = 0;
    }
    
    public CuentaAhorro(int numero, double saldoInicial) {
        super(numero, saldoInicial);
        this.tasaInteres = 0.02;
        this.saldoMinimo = saldoInicial;
    }
    
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres / 100; 
    }
    
    @Override
    public void retirar(double monto) {
        super.retirar(monto);
        if (saldo < saldoMinimo) {
            saldoMinimo = saldo;
        }
    }
    
    @Override
    public void consultar() {

        double interes = saldoMinimo * tasaInteres;
        depositar(interes);
 
        saldoMinimo = saldo;
        System.out.println("Interés generado: " + interes);
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro [numero=" + numero + ", saldo=" + saldo + 
               ", tasaInteres=" + tasaInteres + ", saldoMinimo=" + saldoMinimo + "]";
    }
}
