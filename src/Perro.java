public class Perro extends Mascota{
    public Perro(String nombre, Persona dueño) {
        super(nombre, dueño);
    }

    @Override
    String saludo(Persona dueño) {
        return "guau";
    }
}
