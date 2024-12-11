package Mascota;

import Persona.Persona;

public class Gato extends Mascota {
    public Gato(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    void saludo(Persona dueño) {
        if(dueño == getDueño()){
            System.out.println("miau");
        }else{
            System.out.println("MIAU");
        }
    }
}
