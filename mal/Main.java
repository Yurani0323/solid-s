package mal;

/*
 * Ejemplo que viola el principio S.
 *
 * Cliente almacena datos
 * y además imprime carnets.
 *
 * Tiene más de una responsabilidad.
 */

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente("Carlos Pérez");

        cliente.imprimirCarnet();
    }
}