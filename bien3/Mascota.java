package bien3;

/*
 * PRINCIPIO S
 *
 * Esta clase representa una mascota.
 *
 * Su única responsabilidad es almacenar
 * información relacionada con la mascota.
 */

public class Mascota {

    private String nombre;
    private String especie;

    public Mascota(String nombre,
                   String especie) {

        this.nombre = nombre;
        this.especie = especie;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecie() {
        return especie;
    }

    // No imprime reportes.
    // No genera documentos.
    // Solo representa la mascota.
}