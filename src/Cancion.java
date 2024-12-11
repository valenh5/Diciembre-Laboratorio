import Persona.Persona;

public class Cancion {
    private String nombre;
    private int duracion;
    private Persona artista;

    public Cancion(String nombre, int duracion, Persona artista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Persona getArtista() {
        return artista;
    }

    public void setArtista(Persona artista) {
        this.artista = artista;
    }
}
