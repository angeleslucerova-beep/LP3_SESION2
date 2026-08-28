package Actividades;

public class Coche {

    //atributos
    public String marca;
    public String modelo; //tercer constructor
    public int añoFabricacion;
    public int precio;

    //constructor por defecto 2
    public Coche(){}

    //constructor por defecto 3
    public Coche(String marca, String modelo, int añoFabricacion, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
    }

    //metodos
    public void aplicarDescuento(){
        double porcentaje = 20.0;
        
        if ( this.añoFabricacion < 2010 ){
            double descuento = this.precio*(porcentaje/100);
            double monstrar = this.precio - descuento;
            System.out.println("DESCUENTO APLICADO" + "//" + monstrar);
        } else {
            System.out.println("NO APLICA DESCUENTO");
        }
    }
    
    public static void main(String[]p) {
        //sin descuento
        System.out.println("PRIMER COCHE");
        System.out.println("Valores dados: (\"Ferrari\",\"Corolla\",2019,20000)");
        Coche cañita1 = new Coche("Ferrari","Corolla",2019,20000);
        cañita1.aplicarDescuento();
        
        //con descuento
        System.out.println("SEGUNDO COCHE");
        System.out.println("Valores dados: (\"Tilin\",\"Truck\",2001,15000)");
        Coche cañita2 = new Coche("Tilin","Truck",2001,15000);
        cañita2.aplicarDescuento();
    }
    //cierre de clase
}
