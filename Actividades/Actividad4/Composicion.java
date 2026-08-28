package Actividades;

public class Composicion {

	    public static void main(String[] args) {
	        
	        Persona persona1 = new Persona(101, "Ana", "García");
	        Persona persona2 = new Persona(102, "Carlos", "López");
	        
	        //estado inicial
	        System.out.println(persona1);
	        System.out.println(persona2);
	        
	        //modifica saldo
	        persona1.getcuenta().setsaldo(500.75);
	        persona2.getcuenta().setsaldo(1200.00);
	        
	        //cambio de saldo
	        System.out.println("\nDespués de modificar saldos:");
	        System.out.println(persona1);
	        System.out.println(persona2);
	        
	        System.out.println("\nAccediendo a cuentas individuales:");
	        System.out.println("Cuenta de Ana: " + persona1.getcuenta());
	        System.out.println("Cuenta de Carlos: " + persona2.getcuenta());
	        
	        System.out.println("\nDemostración de composición:");
	        System.out.println("La cuenta se crea dentro de Persona: " + persona1.getcuenta().numero());
	   
	    }
	}
