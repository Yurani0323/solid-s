package bien3;

/*
 * PRINCIPIO S
 *
 * Esta clase tiene una única responsabilidad:
 * generar el reporte de una mascota.
 *
 * Si el formato del reporte cambia,
 * solo se modifica esta clase.
 */

public class ReporteMascota {

    public void imprimir(Mascota mascota) {

        System.out.println("===== REPORTE DE MASCOTA =====");
        System.out.println("Nombre: "
                + mascota.obtenerNombre());

        System.out.println("Especie: "
                + mascota.obtenerEspecie());

        System.out.println("==============================");
    }
}