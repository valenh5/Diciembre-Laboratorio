import Persona.Persona;

import java.time.LocalDate;

public class Serie extends Multimedia{
    private int totalCapitulos, totalTemporadas;
    private LocalDate fechaLanzamiento;

    public Serie(String titulo, Persona autor, int duracion, FormatoMultimedia formato, int totalCapitulos, int totalTemporadas, LocalDate fechaLanzamiento) {
        super(titulo, autor, duracion, formato);
        this.totalCapitulos = totalCapitulos;
        this.totalTemporadas = totalTemporadas;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getTotalCapitulos() {
        return totalCapitulos;
    }

    public void setTotalCapitulos(int totalCapitulos) {
        this.totalCapitulos = totalCapitulos;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
