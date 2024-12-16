package Mascota;

import Persona.Persona;

public class Perro extends Mascota {
    private Persona pe;
    public Perro(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    void saludo(Persona dueñoo) {
        if(dueñoo == getDueño()){
            System.out.println("guau");
        }else{
            System.out.println("GUAU!");
        }

    }



}
