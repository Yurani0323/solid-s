package bien2;

/*
 * PRINCIPIO S
 *
 * Esta clase tiene la responsabilidad
 * de generar o imprimir un carnet.
 *
 * Si cambia el diseño del carnet,
 * solamente se modifica esta clase.
 */

public class CarnetCliente {

    public void imprimir(Cliente cliente) {

        System.out.println("===== CARNET =====");
        System.out.println("Cliente: "
                + cliente.obtenerNombre());
        System.out.println("==================");
    }
}