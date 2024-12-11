//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Junior extends Socio {
    private static HashSet<Actividad> actividadesPermitidas;
    private static int porcentajeAumento;
    private boolean yaIngresoUnaVez = false;

    public Junior(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int numSocio, int valorCuota) {
        super(nombre, apellido, fechaNacimiento, dni, numSocio, valorCuota);
    }

    public boolean isYaIngresoUnaVez() {
        return this.yaIngresoUnaVez;
    }

    public void setYaIngresoUnaVez(boolean yaIngresoUnaVez) {
        this.yaIngresoUnaVez = yaIngresoUnaVez;
    }

    public static HashSet<Actividad> getActividadesPermitidas() {
        return actividadesPermitidas;
    }

    public static void setActividadesPermitidas(HashSet<Actividad> actividadesPermitidas) {
        Junior.actividadesPermitidas = actividadesPermitidas;
    }

    public static int getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public static void setPorcentajeAumento(int porcentajeAumento) {
        Junior.porcentajeAumento = porcentajeAumento;
    }

    public boolean verificarActividad(Actividad actividad) {

        return actividadesPermitidas.contains(actividad);
    }

    public void mensajeDeDeniego() {
    }

    static {
        actividadesPermitidas = new HashSet(Arrays.asList(Actividad.AJEDREZ, Actividad.FUTBOL, Actividad.ARQUERIA, Actividad.HANDBALL, Actividad.TAEKWONDO, Actividad.TENIS, Actividad.VOLLEY));
        porcentajeAumento = 3;
    }
}
