package Mascota;

import Persona.Persona;

import java.util.HashSet;

public class MainMascota {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "bb", 23);
        Persona persona2 = new Persona("Horacio", "dd", 43);
        Perro perro = new Perro("Perruno", persona1);
        Gato gato = new Gato("Peron", persona1);
        Pajarito pajaro1 = new Pajarito("Miguel", persona1, false, null);
        Pajarito pajaro2 = new Pajarito("Pablo", persona1, true, "cocoro");

        HashSet<Mascota> mascotas = new HashSet<>();
        mascotas.add(perro);

        SistemaMascota local = new SistemaMascota(mascotas);
        System.out.println(local.getMascotas());
        local.eliminarMascota(perro);
        System.out.println(local.getMascotas());
        local.agregarMascota(perro);
        System.out.println(local.getMascotas());

        local.modificarMascota(perro, gato);
        System.out.println(local.getMascotas());
    }
}
