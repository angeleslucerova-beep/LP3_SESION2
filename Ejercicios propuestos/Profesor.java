public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("   [Docente Principal] ID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad);
    }
}
