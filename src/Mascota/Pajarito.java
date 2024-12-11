package Mascota;

import Mascota.Mascota;
import Persona.Persona;

public class Pajarito extends Mascota {

    private boolean esCantor;
    private String canto;

    public Pajarito(String nombre, Persona dueño, boolean esCantor, String canto) {
        super(nombre, dueño);
        this.esCantor = esCantor;
        this.canto = canto;
    }

    @Override
    void saludo(Persona dueño) {
        if(dueño == getDueño()){
            if(esCantor){
                System.out.println(canto);
            }else{
                System.out.println("pio");
            }
        }
    }
}
