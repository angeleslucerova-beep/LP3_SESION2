public class SistemaJuego {
    public static void main(String[] args) {
        System.out.println("--- BIENVENIDO A " + PersonajeBase.MUNDO + " ---");

        // 1. Crear el objeto Inventario de forma independiente (Agregación)
        Inventario inventarioComun = new Inventario();

        // 2. Crear objetos de las clases hijas (Instanciación)
        Guerrero artas = new Guerrero("Arthas", inventarioComun);
        Guerrero boris = new Guerrero("Boris", inventarioComun);

        // 3. Acciones solicitadas 
        
        // Acción A: Un personaje usando una habilidad sobre otro / Interacción de niveles
        System.out.println("\n--- [ACCIÓN 1] Interacción de Habilidades y Niveles ---");
        artas.usarHabilidad();
        artas.atacar(boris);
        artas.ganarExperiencia(); // Sube de nivel

        // Demostración de Sobrecarga (Polimorfismo estático)
        artas.usarHabilidad("Furia de Dragón");

        // Acción B: Un personaje recolectando un objeto del entorno (Inventario)
        System.out.println("\n--- [ACCIÓN 2] Recolección de Objetos ---");
        Objeto espadaAncestral = new Objeto("Espada de Runas");
        artas.inventario.guardarObjeto(espadaAncestral);

        // 4. Reporte final mediante Variables de Clase (static)
        System.out.println("\n--- ESTADÍSTICAS DEL SERVIDOR ---");
        System.out.println("Total de héroes creados en el mundo: " + PersonajeBase.contadorPersonajes);
    }
}
