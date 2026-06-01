package mal;

/*
 * EJEMPLO INCORRECTO
 *
 * Esta clase VIOLA el principio S.
 *
 * Tiene DOS responsabilidades:
 *
 * 1. Administrar los datos del cliente.
 * 2. Imprimir el carnet.
 *
 * Una clase debería tener una sola razón
 * para cambiar.
 */

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    /*
     * RESPONSABILIDAD INCORRECTA
     *
     * Imprimir carnets pertenece a otra clase.
     *
     * Si el diseño del carnet cambia,
     * habrá que modificar Cliente.java.
     *
     * Esto rompe el principio S.
     */
    public void imprimirCarnet() {

        System.out.println("===== CARNET =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("==================");
    }
}