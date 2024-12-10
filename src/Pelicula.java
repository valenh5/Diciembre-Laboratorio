import java.time.LocalDate;

public class Pelicula {
    private String nombre;
    private LocalDate fecha;
    private boolean apta;

    public Pelicula(String nombre, LocalDate fecha, boolean apta) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.apta = apta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isApta() {
        return apta;
    }

    public void setApta(boolean apta) {
        this.apta = apta;
    }
}
