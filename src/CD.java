import java.util.ArrayList;
import java.util.HashSet;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones(){
        return canciones.size();
    }

    public Cancion verCancion(int numeroCancion){
        return canciones.get(numeroCancion);
    }

    public void cambiarCancion(Cancion cancion, int numeroCancion){
        canciones.set(numeroCancion, cancion);
    }

    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    public void eliminarCancion(int numeroCancion){
        canciones.remove(numeroCancion);
    }
}
