package Evaluacion3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Pasivo extends Socio{
    private static HashSet<Actividades> actividades = new HashSet(Arrays.asList(Actividades.FUTBOL, Actividades.VOLEY, Actividades.TENIS, Actividades.HANDBALL));
    private static int porcentajeAumetno = 7;

    public Pasivo(String nombre, String apellido, String domicilio, int edad, int dni, LocalDate fechaNacimiento, int numSocio, int valorCuota) {
        super(nombre, apellido, domicilio, edad, dni, fechaNacimiento, numSocio, valorCuota);
    }

    public static HashSet<Actividades> getActividades() {
        return actividades;
    }

    public static void setActividades(HashSet<Actividades> actividades) {
        Pasivo.actividades = actividades;
    }

    public static int getPorcentajeAumetno() {
        return porcentajeAumetno;
    }

    public static void setPorcentajeAumetno(int porcentajeAumetno) {
        Pasivo.porcentajeAumetno = porcentajeAumetno;
    }
}
