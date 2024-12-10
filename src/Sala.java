import java.util.ArrayList;
import java.util.HashSet;

public class Sala {
    private int numero, asientos;
    private ArrayList<Pelicula> peliculas;

    public Sala(int numero, int asientos, ArrayList<Pelicula> peliculas) {
        this.numero = numero;
        this.asientos = asientos;
        this.peliculas = peliculas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    public void modificarPelicula(Pelicula pelicula, int posicion) {
        peliculas.set(posicion, pelicula);
    }
}
