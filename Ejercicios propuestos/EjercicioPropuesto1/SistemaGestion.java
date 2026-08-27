public class SistemaGestion {
    // Variable de Clase (static): Compartida globalmente para contar cursos creados
    private static int totalCursosDisponibles = 0; 

    // Variable de instancia (Relación de Composición)
    private Curso[] repositorioCursos;
    private int contadorCursos;

    public SistemaGestion() {
        this.repositorioCursos = new Curso[10]; // El sistema controla hasta 10 cursos
        this.contadorCursos = 0;
    }

    // Método de Instancia
    public void registrarCurso(Curso curso) {
        if (contadorCursos < 10) {
            repositorioCursos[contadorCursos] = curso;
            contadorCursos++;
            totalCursosDisponibles++; // Afecta la variable estática
        }
    }

    // Método de Clase (static)
    public static int getTotalCursosDisponibles() {
        return totalCursosDisponibles;
    }


    public static void main(String[] args) {
        // 1. Instanciamos el core del sistema
        SistemaGestion sistema = new SistemaGestion();

        // 2. Instanciamos las personas (Componentes independientes)
        Profesor ingKarim = new Profesor("P01", "Karim Guevara", "Desarrollo de Software");
        Estudiante alumno1 = new Estudiante("E01", "Mario Santillana", "Ing. de Sistemas");
        Estudiante alumno2 = new Estudiante("E02", "Diego Iquira", "Ing. de Sistemas");

        // 3. Creamos el curso inyectándole su respectivo profesor por el constructor
        Curso cursoLP3 = new Curso("LP3-S2", "Lenguajes de Programación III", "Programación", ingKarim);

        // 4. Agregamos los estudiantes al curso
        cursoLP3.inscribirEstudiante(alumno1);
        cursoLP3.inscribirEstudiante(alumno2);

        // 5. Composición: El sistema registra el curso
        sistema.registrarCurso(cursoLP3);

        // 6. Imprimir reportes usando nuestra interfaz conceptual
        cursoLP3.mostrarDetalles();

        System.out.println("\n--------------------------------------------------------");
        System.out.println("REPORTE GLOBAL DEL SISTEMA DE GESTIÓN:");
        System.out.println("Cantidad de cursos operativos en la universidad: " + SistemaGestion.getTotalCursosDisponibles());
        System.out.println("--------------------------------------------------------");
    }
}
