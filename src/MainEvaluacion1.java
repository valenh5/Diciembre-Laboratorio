import java.time.LocalDate;
import java.util.ArrayList;

public class MainEvaluacion1 {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Pelicula A", LocalDate.of(2023, 5, 15), true);
        Pelicula p2 = new Pelicula("Pelicula B", LocalDate.of(2022, 8, 10), false);

        ArrayList<Pelicula> peliculasSala1 = new ArrayList<>();
        peliculasSala1.add(p1);

        ArrayList<Pelicula> peliculasSala2 = new ArrayList<>();
        peliculasSala2.add(p2);

        Sala sala1 = new Sala(1, 100, peliculasSala1);
        Sala sala2 = new Sala(2, 50, peliculasSala2);

        ArrayList<Sala> salasCine = new ArrayList<>();
        salasCine.add(sala1);
        salasCine.add(sala2);

        Cine cine = new Cine("Cine Hoyts", salasCine);

        cine.catalogoSalas();
        System.out.println("Salas con más de 80 asientos: " + cine.salasMas80());

        sala1.agregarPelicula(p2);
        sala1.modificarPelicula(new Pelicula("Pelicula C", LocalDate.of(2024, 3, 25), true), 0);
        sala1.eliminarPelicula(p1);

        cine.catalogoSalas();
    }

}
