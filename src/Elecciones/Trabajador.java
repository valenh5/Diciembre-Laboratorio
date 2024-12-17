package Elecciones;

import Persona.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Trabajador extends Persona implements Campaña{
    private int cuil, sueldo;
    private String direccion;
    private HashSet<LocalDate> horarioLaboral;

    public Trabajador(String nombre, String apellido, int edad, int cuil, int sueldo, String direccion, HashSet<LocalDate> horarioLaboral) {
        super(nombre, apellido, edad);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.horarioLaboral = horarioLaboral;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<LocalDate> getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(HashSet<LocalDate> horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    @Override
    public void hacerCampaña(String mensaje) {
        if(horarioLaboral.contains(LocalDate.now())){
            System.out.println("Yo, " + getNombre() + " ,te invito a que "+ mensaje);
        }else{
            System.out.println("No es su horario");
        }
    }
}
