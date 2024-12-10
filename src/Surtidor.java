import java.util.HashMap;

public class Surtidor {
    private int numero;
    private HashMap<Combustible, Integer> combustibles;

    public Surtidor(int numero, HashMap<Combustible, Integer> combustibles) {
        this.numero = numero;
        this.combustibles = combustibles;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public HashMap<Combustible, Integer> getCombustibles() {
        return combustibles;
    }

    public void setCombustibles(HashMap<Combustible, Integer> combustibles) {
        this.combustibles = combustibles;
    }

    public void cargarCombustibleSurtidor(Combustible tipo, int cantidad) throws FaltaCombustibleException{
        if(getCombustibles().get(tipo) > cantidad){
            int nuevo = getCombustibles().get(tipo) - cantidad;
            getCombustibles().remove(tipo);
            getCombustibles().put(tipo, nuevo);
        }else{
            throw new FaltaCombustibleException("Combustible de este tipo insuficiente");
        }
    }
}
