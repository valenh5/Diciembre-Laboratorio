//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Activo extends Socio {
    private static HashSet<Actividad> actividadesPermitidas;
    private static int porcentajeAumento;

    public Activo(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int numSocio, int valorCuota) {
        super(nombre, apellido, fechaNacimiento, dni, numSocio, valorCuota);
    }

    public static HashSet<Actividad> getActividadesPermitidas() {
        return actividadesPermitidas;
    }

    public static void setActividadesPermitidas(HashSet<Actividad> actividadesPermitidas) {
        Activo.actividadesPermitidas = actividadesPermitidas;
    }

    public static int getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public static void setPorcentajeAumento(int porcentajeAumento) {
        Activo.porcentajeAumento = porcentajeAumento;
    }

    public boolean verificarActividad(Actividad actividad) {
        return actividadesPermitidas.contains(actividad);
    }

    public void mensajeDeDeniego() {
        System.out.println("Esta actividad no esta incluida");
    }

    static {
        actividadesPermitidas = new HashSet(Arrays.asList(Actividad.AJEDREZ, Actividad.FUTBOL, Actividad.ARQUERIA, Actividad.HANDBALL, Actividad.ESGRIMA, Actividad.TAEKWONDO, Actividad.TENIS, Actividad.VOLLEY));
        porcentajeAumento = 10;
    }
}
