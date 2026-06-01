package bien1;

/*
 * PRINCIPIO S (Single Responsibility Principle)
 *
 * Esta clase tiene UNA SOLA responsabilidad:
 * representar un producto y almacenar sus datos.
 *
 * Si cambia la información del producto,
 * solo esta clase deberá modificarse.
 */

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecio() {
        return precio;
    }

    // NO imprime facturas.
    // NO genera reportes.
    // Solo representa al producto.
}