package Mascota;

import Persona.Persona;

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
        boolean esta = false;
        for(Mascota m : mascotas){
            if(m.getNombre().equals(mascota.getNombre())){
                esta = true;
            }
        }
        if(esta == true){
            System.out.println("No se puede ingresar, el nombre ya esta presente");
        }else{
            mascotas.add(mascota);
        }
    }

    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }

    public void modificarMascota(Mascota viejo, Mascota nuevo){
        eliminarMascota(viejo);
        agregarMascota(nuevo);
    }

    public void saludar(String nombre, Persona dueño){
        for(Mascota m : mascotas){
            if(m.getNombre().equals(nombre)){
                m.saludo(dueño);
            }
            if(m instanceof Pez){
                if(((Pez) m).getVidas() == 0){
                    eliminarMascota(m);
                }
            }

        }
    }
}
