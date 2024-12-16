package Mascota;

import Persona.Persona;

public class Pez extends Mascota{
    private int vidas = 10;

    public Pez(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    void saludo(Persona dueño) {
        if(dueño == getDueño()){
            System.out.println("Es el dueño pierde una vida");
            vidas--;
        }else{
            System.out.println("No es el dueño, por ende murio");
            vidas = 0;
        }
    }
}
