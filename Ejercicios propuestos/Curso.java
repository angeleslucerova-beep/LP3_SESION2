public class Curso implements Reportable {
    // Uso de Constantes 
    public static final int MAX_ESTUDIANTES = 5; 

    // Variables de instancia
    private String codigo;
    private String nombreCurso;
    private String categoria;
    
    // Relación de Agregación e Inyección de Dependencias por Constructor
    private Profesor profesor; 
    private Estudiante[] estudiantesMatriculados;
    private int contadorEstudiantes;

    // El 'profesor' se INYECTA aquí al crear el curso
    public Curso(String codigo, String nombreCurso, String categoria, Profesor profesor) {
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        this.categoria = categoria;
        this.profesor = profesor; // Recibe la dependencia desde afuera
        this.estudiantesMatriculados = new Estudiante[MAX_ESTUDIANTES];
        this.contadorEstudiantes = 0;
    }

    public void inscribirEstudiante(Estudiante est) {
        if (contadorEstudiantes < MAX_ESTUDIANTES) {
            estudiantesMatriculados[contadorEstudiantes] = est;
            contadorEstudiantes++;
        } else {
            System.out.println(" No hay vacantes en este curso para: " + est.nombre);
        }
    }

    public int getCantidadMatriculados() {
        return this.contadorEstudiantes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n========================================================");
        System.out.println("CURSO: " + nombreCurso + " [" + codigo + "] | Categoría: " + categoria);
        System.out.println("========================================================");
        profesor.mostrarDetalles(); // Utiliza la abstracción del profesor
        System.out.println("Lista de Alumnos Matriculados (" + contadorEstudiantes + "):");
        
        for (int i = 0; i < contadorEstudiantes; i++) {
            estudiantesMatriculados[i].mostrarDetalles(); // Polimorfismo en acción
        }
    }
}
