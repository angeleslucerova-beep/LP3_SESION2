public class Inventario {
    private Objeto[] items;
    private int contadorItems;

    public Inventario() {
        this.items = new Objeto[5]; // Capacidad para 5 objetos
        this.contadorItems = 0;
    }

    public void guardarObjeto(Objeto obj) {
        if (contadorItems < items.length) {
            items[contadorItems] = obj;
            contadorItems++;
            System.out.println("   [Inventario] Guardado: " + obj.getNombreObjeto());
        }
    }
}
