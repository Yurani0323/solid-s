package bien1;


/*
 * PRINCIPIO S (Single Responsibility Principle)
 *
 * Esta clase tiene UNA SOLA responsabilidad:
 * imprimir la factura de un producto.
 *
 * Si el formato de la factura cambia,
 * únicamente se modifica esta clase.
 */

public class Factura {

    public void imprimir(Producto producto) {

        System.out.println("===== FACTURA =====");
        System.out.println("Producto: " + producto.obtenerNombre());
        System.out.println("Precio: $" + producto.obtenerPrecio());
        System.out.println("===================");
    }
}