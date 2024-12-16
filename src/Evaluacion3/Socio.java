package Evaluacion3;

import Persona.Persona;

import java.time.LocalDate;

public abstract class Socio extends Persona {
    private int numSocio, valorCuota;

    public Socio(String nombre, String apellido, String domicilio, int edad, int dni, LocalDate fechaNacimiento, int numSocio, int valorCuota) {
        super(nombre, apellido, domicilio, edad, dni, fechaNacimiento);
        this.numSocio = numSocio;
        this.valorCuota = valorCuota;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }
}
