import java.util.ArrayList;

public class Cine {
    private String nombre;
    private ArrayList<Sala> salas;

    public Cine(String nombre, ArrayList<Sala> salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Integer> salasMas80(){
        ArrayList<Integer> numSalas= new ArrayList<>();
        for(Sala sala : salas){
            if(sala.getAsientos()>80){
                numSalas.add(sala.getNumero());
            }
        }
        return numSalas;
    }

    public void catalogoSalas(){
        for(Sala sala : salas){
            System.out.println("El numero de la sala: " + sala.getNumero());
            System.out.println("Su cantidad de peliculas: " + sala.getPeliculas().size());
        }
    }
}
