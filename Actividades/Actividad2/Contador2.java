package Actividades;

public class Contador2 {

    static int acumulador = 0;             
    final static int VALOR_INICIAL = 10;    
    static int nContadores = 0;             
    static int ultimoContador = 0;          
    private int valor;                      
    
    public static int acumulador() {
        return acumulador;
    }
 
    public static int getNContadores() {
        return nContadores;
    }
    
    public static int getUltimoContador() {
        return ultimoContador;
    }
    
    public Contador2(int valor) {
        this.valor = valor;                         
        Contador2.acumulador += valor;              
        Contador2.nContadores++;                    
        Contador2.ultimoContador = valor;           
    }
    
    public Contador2() {
        this(Contador2.VALOR_INICIAL);              
    }

    public void inc() {
        this.valor++;                               
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}
