package Evaluacion4;

import Persona.Persona;

public class EmpleadoEstacion extends Persona {
    private int cuil;

    public EmpleadoEstacion(String nombre, String apellido, int edad, int cuil) {
        super(nombre, apellido, edad);
        this.cuil = cuil;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
}
