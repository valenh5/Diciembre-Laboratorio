package Mascota;

import java.util.HashSet;

public class SistemaMascota {
    private HashSet<Mascota> mascotas;

    public SistemaMascota(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
    }

    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }

    public void modificarMascota(Mascota viejo, Mascota nuevo){
        mascotas.remove(viejo);
        mascotas.add(nuevo);
    }
}
