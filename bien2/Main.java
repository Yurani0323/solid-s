package bien2;

/*
 * Ejemplo correcto del principio S.
 *
 * Cliente almacena información.
 * CarnetCliente genera el carnet.
 */

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente("Carlos Pérez");

        CarnetCliente carnet =
                new CarnetCliente();

        carnet.imprimir(cliente);
    }
}