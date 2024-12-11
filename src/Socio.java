//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Persona.Persona;

import java.time.LocalDate;

public abstract class Socio extends Persona {
    private int numSocio;
    private int valorCuota;

    public Socio(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int numSocio, int valorCuota) {
        super(nombre, apellido, fechaNacimiento, dni);
        this.numSocio = numSocio;
        this.valorCuota = valorCuota;
    }



    public int getNumSocio() {
        return this.numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public int getValorCuota() {
        return this.valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public abstract boolean verificarActividad(Actividad var1);

    public abstract void mensajeDeDeniego();
}
