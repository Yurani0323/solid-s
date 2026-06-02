package mal;

/*
 * ACTIVIDAD
 *
 * Esta clase NO cumple el Principio
 * de Responsabilidad Única (SRP).
 *
 * Analiza el código e identifica
 * las diferentes responsabilidades
 * que tiene la clase Cliente.
 *
 * Luego propón una solución
 * aplicando la S de SOLID.
 */

public class Cliente {

    private String nombre;
    private String correo;
    private int puntos;

    public Cliente(String nombre,
                   String correo,
                   int puntos) {

        this.nombre = nombre;
        this.correo = correo;
        this.puntos = puntos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public int obtenerPuntos() {
        return puntos;
    }

    public void imprimirCarnet() {

        System.out.println("===== CARNET =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("==================");
    }

    public void enviarCorreoBienvenida() {

        System.out.println(
                "Enviando correo a: " + correo);
    }

    public void generarReportePuntos() {

        System.out.println(
                "Puntos acumulados: " + puntos);
    }
}