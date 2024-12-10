import java.time.LocalDate;
import java.util.ArrayList;

public class MainEvaluacion2 {
    public static void main(String[] args) {
        Persona autor1 = new Persona("Autor", "Uno", 45) {};
        Persona autor2 = new Persona("Autor", "Dos", 40) {};
        Persona actorPrincipal = new Persona("Actor", "Principal", 35) {};
        Persona actrizPrincipal = new Persona("Actriz", "Principal", 30) {};

        PeliculaMultimedia pelicula = new PeliculaMultimedia("Tadeo Jones", autor1, 120, FormatoMultimedia.MP4, actorPrincipal, actrizPrincipal);
        Serie serie = new Serie("The Office", autor2, 45, FormatoMultimedia.MP3, 10, 3, LocalDate.of(2020, 1, 1));
        Serie serie2 = new Serie("Lost", autor1, 50, FormatoMultimedia.AVI, 12, 5, LocalDate.of(2021, 5, 15));

        ArrayList<Multimedia> productos = new ArrayList<>();
        productos.add(pelicula);
        productos.add(serie);
        productos.add(serie2);

        Videoclub videoclub = new Videoclub(productos);

        System.out.println(videoclub.verificarSimilitud(pelicula, serie));
        System.out.println(videoclub.serieMasTemporadas().getTitulo());
        System.out.println(videoclub.cantidadPorFormato());
    }
}
