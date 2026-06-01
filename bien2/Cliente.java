package bien2;

/*
 * PRINCIPIO S
 *
 * Esta clase representa un cliente.
 *
 * Su única responsabilidad es almacenar
 * y proporcionar la información del cliente.
 */

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    // No imprime carnets.
    // No genera reportes.
    // Solo administra los datos del cliente.
}