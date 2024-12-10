import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Videoclub {
    private ArrayList<Multimedia> productos;

    public Videoclub(ArrayList<Multimedia> productos) {
        this.productos = productos;
    }

    public ArrayList<Multimedia> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Multimedia> productos) {
        this.productos = productos;
    }

    public boolean verificarSimilitud(Multimedia m, Multimedia m2){
        return m.getAutor() == m2.getAutor() && m.getTitulo().equals(m2.getTitulo()) && m.getFormato() == m2.getFormato();
    }

    public Serie serieMasTemporadas(){
        Serie mayor = null;
        for(Multimedia m : productos){
            if(m instanceof Serie){
                if(mayor == null || ((Serie) m).getTotalTemporadas() > mayor.getTotalTemporadas()){
                    mayor = (Serie) m;
                }
            }
        }
        return mayor;
    }

    public HashMap<FormatoMultimedia, Integer> cantidadPorFormato() {
        HashMap<FormatoMultimedia, Integer> cantidad = new HashMap<>();
        for (Multimedia m : productos) {
            FormatoMultimedia formato = m.getFormato();
            if (cantidad.containsKey(formato)) {
                cantidad.put(formato, cantidad.get(formato) + 1);
            } else {
                cantidad.put(formato, 1);
            }
        }
        return cantidad;
    }
}
