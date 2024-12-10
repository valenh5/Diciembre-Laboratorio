public class Gato extends Mascota{
    public Gato(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    String saludo(Persona dueño) {
        return "miau";
    }
}
