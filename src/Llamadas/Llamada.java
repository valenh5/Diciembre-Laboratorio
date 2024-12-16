package Llamadas;

import java.time.LocalDate;

public class Llamada {
    private Empleado origen, destino;
    private int duracion;
    private LocalDate fecha;

    public Llamada(Empleado origen, Empleado destino, int duracion, LocalDate fecha) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
