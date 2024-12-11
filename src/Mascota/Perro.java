package Mascota;

import Persona.Persona;

public class Perro extends Mascota {
    public Perro(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    void saludo(Persona dueño) {
        if(dueño == getDueño()){
            System.out.println("guau");
        }else{
            System.out.println("GUAU!");
        }

    }
}
