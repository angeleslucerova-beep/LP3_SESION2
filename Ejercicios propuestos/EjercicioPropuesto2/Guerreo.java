public class Guerrero extends PersonajeBase implements IAtaqueFisico {

    public Guerrero(String nombre, Inventario inventario) {
        super(nombre, "Guerrero", inventario);
    }

    @Override
    public void usarHabilidad() {
        System.out.println("   [Habilidad] " + nombre + " activa: " + habilidades[0].getNombre());
    }
 // Polimorfismo dinámico: Comportamiento propio al atacar
    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println("   [Ataque] El Guerrero " + this.nombre + " arremete contra " + objetivo.nombre);
        atacarFisico();
        objetivo.recibirDanio(25);
    }

    @Override
    public void atacarFisico() {
        System.out.println("   -> Impacto fisico con Espada Pesada (-25 HP)");
    }
}
