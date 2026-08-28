package Actividades;

public class CuentaCorriente extends Cuenta1 {
    private int contadorRetiros;
    private static final int RETIROS_GRATUITOS = 3;
    private static final double TARIFA_TRANSACCION = 3.0;
    
    public CuentaCorriente(int numero) {
        super(numero);
        this.contadorRetiros = 0;
    }
    
    public CuentaCorriente(int numero, double saldoInicial) {
        super(numero, saldoInicial);
        this.contadorRetiros = 0;
    }
    
    @Override
    public void retirar(double monto) {
        super.retirar(monto);
        contadorRetiros++;
        
        if (contadorRetiros > RETIROS_GRATUITOS) {
            super.retirar(TARIFA_TRANSACCION);
            System.out.println("Tarifa de transacción aplicada: S/. " + TARIFA_TRANSACCION);
        }
    }
    
    @Override
    public void consultar() {

        System.out.println("Retiros realizados este mes: " + contadorRetiros);
        System.out.println("Retiros gratuitos: " + (RETIROS_GRATUITOS - contadorRetiros));
        contadorRetiros = 0;
        System.out.println("Contador de retiros reiniciado para el nuevo mes");
    }
    
    @Override
    public String toString() {
        return "CuentaCorriente [numero=" + numero + ", saldo=" + saldo + 
               ", contadorRetiros=" + contadorRetiros + "]";
    }
}
