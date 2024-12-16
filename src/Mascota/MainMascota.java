package Mascota;

import Persona.Persona;

import java.util.HashSet;

public class MainMascota {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "bb", 23);
        Persona persona2 = new Persona("Horacio", "dd", 43);
        Perro perro = new Perro("Perruno", persona1);
        Perro perro2 = new Perro("Perruno", persona1);
        Gato gato = new Gato("Peron", persona1);
        Pajarito pajaro1 = new Pajarito("Miguel", persona1, false, null);
        Pajarito pajaro2 = new Pajarito("Pablo", persona1, true, "cocoro");
        Pez pez1 = new Pez("Pepe", persona1);

        HashSet<Mascota> mascotas = new HashSet<>();
        mascotas.add(perro);
        mascotas.add(pez1);
        SistemaMascota clinica = new SistemaMascota(mascotas);
        clinica.agregarMascota(perro2);
        clinica.saludar("Pepe", persona1);
        clinica.saludar("Pepe", persona2);

    }
}
