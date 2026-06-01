package bien3;

/*
 * Ejemplo correcto del principio S.
 *
 * Mascota representa los datos.
 * ReporteMascota imprime el reporte.
 */

public class Main {

    public static void main(String[] args) {

        Mascota mascota =
                new Mascota("Max", "Perro");

        ReporteMascota reporte =
                new ReporteMascota();

        reporte.imprimir(mascota);
    }
}