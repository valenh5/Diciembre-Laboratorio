import java.util.ArrayList;

public class MainCancion {
    public static void main(String[] args) {
        Persona artista = new Persona("Juan", "Perez", 30) {};
        Cancion cancion1 = new Cancion("Cancion 1", 200, artista);
        Cancion cancion2 = new Cancion("Cancion 2", 180, artista);
        Cancion cancion3 = new Cancion("Cancion 3", 210, artista);

        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        listaCanciones.add(cancion1);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);

        CD cd = new CD(listaCanciones);

        System.out.println(cd.numeroCanciones());
        System.out.println(cd.verCancion(1).getNombre());
        cd.cambiarCancion(new Cancion("Nueva Cancion", 190, artista), 1);
        System.out.println(cd.verCancion(1).getNombre());
        cd.agregarCancion(new Cancion("Cancion Extra", 220, artista));
        System.out.println(cd.numeroCanciones());
        cd.eliminarCancion(2);
        System.out.println(cd.numeroCanciones());
    }
}
