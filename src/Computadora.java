import java.util.HashSet;

public class Computadora {
    private HashSet<Componentes> componentes;

    public Computadora(HashSet<Componentes> componentes) {
        this.componentes = componentes;
    }

    public HashSet<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<Componentes> componentes) {
        this.componentes = componentes;
    }
}
