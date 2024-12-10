//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Pasivo extends Socio {
    private static HashSet<Actividad> actividadesPermitidas;
    private static int porcentajeAumento;

    public Pasivo(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int numSocio, int valorCuota) {
        super(nombre, apellido, fechaNacimiento, dni, numSocio, valorCuota);
    }

    public static HashSet<Actividad> getActividadesPermitidas() {
        return actividadesPermitidas;
    }

    public static void setActividadesPermitidas(HashSet<Actividad> actividadesPermitidas) {
        Pasivo.actividadesPermitidas = actividadesPermitidas;
    }

    public static int getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public static void setPorcentajeAumento(int porcentajeAumento) {
        Pasivo.porcentajeAumento = porcentajeAumento;
    }

    public boolean verificarActividad(Actividad actividad) {
        return actividadesPermitidas.contains(actividad);
    }

    public void mensajeDeDeniego() {
        System.out.println("Esta actividad no esta incluida");
    }

    static {
        actividadesPermitidas = new HashSet(Arrays.asList(Actividad.FUTBOL, Actividad.HANDBALL, Actividad.VOLLEY, Actividad.TENIS));
        porcentajeAumento = 7;
    }
}
