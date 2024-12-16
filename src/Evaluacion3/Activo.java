package Evaluacion3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Activo extends Socio{
    private static HashSet<Actividades> actividades = new HashSet(Arrays.asList(Actividades.ARQUERIA, Actividades.ARQUERIA, Actividades.FUTBOL, Actividades.ESGRIMA, Actividades.HANDBALL, Actividades.TAEKWONDO, Actividades.TENIS, Actividades.VOLEY));
    private static int porcentajeAumento = 6;

    public Activo(String nombre, String apellido, String domicilio, int edad, int dni, LocalDate fechaNacimiento, int numSocio, int valorCuota) {
        super(nombre, apellido, domicilio, edad, dni, fechaNacimiento, numSocio, valorCuota);
    }

    public static HashSet<Actividades> getActividades() {
        return actividades;
    }

    public static void setActividades(HashSet<Actividades> actividades) {
        Activo.actividades = actividades;
    }

    public static int getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public static void setPorcentajeAumento(int porcentajeAumento) {
        Activo.porcentajeAumento = porcentajeAumento;
    }
}
