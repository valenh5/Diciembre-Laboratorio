//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaClub {
    private HashSet<Socio> sociosRegistrados;
    private HashMap<LocalDateTime, Socio> registroAccesos;
    private HashMap<Socio, Actividad> registroJuniors;

    public SistemaClub(HashSet<Socio> sociosRegistrados, HashMap<LocalDateTime, Socio> registroAccesos, HashMap<Socio, Actividad> registroJuniors) {
        this.sociosRegistrados = sociosRegistrados;
        this.registroAccesos = registroAccesos;
        this.registroJuniors = registroJuniors;
    }

    public SistemaClub() {
        this.sociosRegistrados = new HashSet();
        this.registroAccesos = new HashMap();
        this.registroJuniors = new HashMap();
    }

    public HashMap<Socio, Actividad> getRegistroJuniors() {
        return this.registroJuniors;
    }

    public void setRegistroJuniors(HashMap<Socio, Actividad> registroJuniors) {
        this.registroJuniors = registroJuniors;
    }

    public HashSet<Socio> getSociosRegistrados() {
        return this.sociosRegistrados;
    }

    public void setSociosRegistrados(HashSet<Socio> sociosRegistrados) {
        this.sociosRegistrados = sociosRegistrados;
    }

    public HashMap<LocalDateTime, Socio> getRegistroAccesos() {
        return this.registroAccesos;
    }

    public void setRegistroAccesos(HashMap<LocalDateTime, Socio> registroAccesos) {
        this.registroAccesos = registroAccesos;
    }

    public void ingresoSocio(int documento, Actividad actividad) {
        for(Socio socio : this.sociosRegistrados) {
            if (socio.getDni() == documento) {
                if (socio.verificarActividad(actividad)) {
                    this.registroAccesos.put(LocalDateTime.now(), socio);
                    System.out.println("Su ingreso fue registrado con exito");
                } else if (socio instanceof Junior) {
                    if (((Junior)socio).isYaIngresoUnaVez()) {
                        System.out.println("Ya tuvo su unico ingreso a una actividad no permitida");
                    } else {
                        this.registroJuniors.put(socio, actividad);
                        ((Junior)socio).setYaIngresoUnaVez(true);
                        System.out.println("Su primer y unico ingreso fue realizado con exito");
                    }
                } else {
                    socio.mensajeDeDeniego();
                }
            }
        }

    }

    public void agregarSocio(Socio socio) {
        this.sociosRegistrados.add(socio);
    }

    public void vecesQueIngresoAlClub(Socio socio) {
        int vecesIngresadas = 0;

        for(LocalDateTime hora : this.registroAccesos.keySet()) {
            if (this.registroAccesos.get(hora) == socio) {
                ++vecesIngresadas;
            }
        }

        PrintStream var10000 = System.out;
        String var10001 = socio.getNombre();
        var10000.println(var10001 + " " + socio.getApellido() + " ingresó " + vecesIngresadas + " veces");
    }
}
