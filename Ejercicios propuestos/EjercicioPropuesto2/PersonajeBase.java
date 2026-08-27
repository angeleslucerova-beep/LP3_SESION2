public abstract class PersonajeBase {
    // Constantes (final)
    public static final int MAX_SALUD = 100;
    public static final String MUNDO = "Azeroth";

    // Variables de clase (static)
    public static int contadorPersonajes = 0;
    public static final int LIMITE_NIVEL = 50;

    // Modificadores de acceso
    public String nombre;          
    protected int salud;          
    private int nivel;            
    String claseHeroe;            

    // Relaciones
    protected Habilidad[] habilidades; // Composición (Se crean dentro del personaje)
    protected Inventario inventario;   // Agregación (Se inyecta por constructor)

    public PersonajeBase(String nombre, String claseHeroe, Inventario inventario) {
        this.nombre = nombre;
        this.claseHeroe = claseHeroe;
        this.salud = MAX_SALUD;
        this.nivel = 1;
        this.inventario = inventario;   // Agregación: Recibe un inventario externo
        
        // Composición pura: Las habilidades nacen y mueren con el personaje
        this.habilidades = new Habilidad[2];
        this.habilidades[0] = new Habilidad("Golpe Basico");
        this.habilidades[1] = new Habilidad("Defensa Absoluta");

        contadorPersonajes++; 
    }

    public int getNivel() { return this.nivel; } 
    
    protected void recibirDanio(int danio) {     
        this.salud -= danio;
        if (this.salud < 0) this.salud = 0;
    }

    private void subirNivel() {                  
        if (this.nivel < LIMITE_NIVEL) {
            this.nivel++;
            System.out.println("   [Nivel] ¡" + nombre + " subio al nivel " + nivel + "!");
        }
    }

    void ganarExperiencia() {                     
        System.out.println("   [Exp] " + nombre + " gano experiencia.");
        subirNivel(); 
    }
     // Métodos Abstractos para Polimorfismo
    public abstract void usarHabilidad();
    public abstract void atacar(PersonajeBase objetivo);
    
    // Sobrecarga de Métodos (Polimorfismo en tiempo de compilación)
    public void usarHabilidad(String modificador) {
        System.out.println("   [Habilidad Potenciada] " + nombre + " usa su habilidad con: " + modificador);
    }
}
