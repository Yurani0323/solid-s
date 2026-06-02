package mal;

/*
 * EJERCICIO
 *
 * Observa el funcionamiento del programa.
 *
 * ¿Qué responsabilidades podrían
 * separarse en clases diferentes?
 *
 * Justifica tu respuesta utilizando
 * el Principio de Responsabilidad Única.
 */

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(
                        "Carlos Pérez",
                        "carlos@gmail.com",
                        150);

        cliente.imprimirCarnet();
        cliente.enviarCorreoBienvenida();
        cliente.generarReportePuntos();
    }
}