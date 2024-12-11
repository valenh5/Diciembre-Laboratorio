package Persona;

import java.time.LocalDate;

public class Persona {
    private String nombre, apellido, domicilio;
    private int edad, dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String domicilio, int edad, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
