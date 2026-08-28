package Actividades;

import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Cuenta1[] cuentas = new Cuenta1[10];
        
        for (int i = 0; i < 5; i++) {
            cuentas[i] = new CuentaAhorro(i, 1000);
            cuentas[i + 5] = new CuentaCorriente(i + 5, 1000);
        }
        
        Scanner in = new Scanner(System.in);
        boolean done = false;
        
        while (!done) {
            System.out.print("D)epositar R)etirar C)onsultar S)alir: ");
            String op = in.next();
            
            if (op.equals("D") || op.equals("R")) {
                System.out.print("Ingrese un numero de cuenta y un monto: ");
                int num = in.nextInt();
                double monto = in.nextDouble();
                
                if (op.equals("D")) {
                    cuentas[num].depositar(monto);
                } else {
                    cuentas[num].retirar(monto);
                }
                System.out.println("Saldo: " + cuentas[num].getSaldo());
                
            } else if (op.equals("C")) {
                for (int n = 0; n < cuentas.length; n++) {
                    cuentas[n].consultar();
                    System.out.println(n + " " + cuentas[n].getSaldo());
                }
            } else if (op.equals("S")) {
                done = true;
            }
        }
        in.close();
    }
}
