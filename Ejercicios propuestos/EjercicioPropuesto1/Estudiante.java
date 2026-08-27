public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String id, String nombre, String carrera) {
        super(id, nombre); // Inyección de datos hacia el constructor de Persona
        this.carrera = carrera;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("   [Alumno] ID: " + id + " | Nombre: " + nombre + " | Carrera: " + carrera);
    }
}
