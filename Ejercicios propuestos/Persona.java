// Clase abstracta que sirve de base para la herencia
public abstract class Persona implements Reportable {
    protected String id;
    protected String nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // Hereda mostrarDetalles() de Reportable, obligando a sus hijos a implementarlo
}
