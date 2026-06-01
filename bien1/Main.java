package bien1;

/*
 * Ejemplo correcto del principio S.
 *
 * Producto maneja los datos.
 * Factura maneja la impresión.
 *
 * Cada clase tiene una única responsabilidad.
 */

public class Main {

    public static void main(String[] args) {

        Producto producto =
                new Producto("Mouse", 50000);

        Factura factura =
                new Factura();

        factura.imprimir(producto);
    }
}

