package Elecciones;

import java.util.HashSet;

public class PartidoPolitico {
    private int afiliados;
    private String direccion, nombre;
    private HashSet<Campaña>enviadoresMensajes;

    public PartidoPolitico(int afiliados, String direccion, String nombre, HashSet<Campaña> enviadoresMensajes) {
        this.afiliados = afiliados;
        this.direccion = direccion;
        this.nombre = nombre;
        this.enviadoresMensajes = enviadoresMensajes;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Campaña> getEnviadoresMensajes() {
        return enviadoresMensajes;
    }

    public void setEnviadoresMensajes(HashSet<Campaña> enviadoresMensajes) {
        this.enviadoresMensajes = enviadoresMensajes;
    }

    public void agregarMensajero(Campaña mensajero){
        enviadoresMensajes.add(mensajero);
    }

    public void hacerCampaña(){
       for(Campaña campaña : enviadoresMensajes){
           campaña.hacerCampaña("Vote por el partido para un mejor futuro");
       }
    }
}
