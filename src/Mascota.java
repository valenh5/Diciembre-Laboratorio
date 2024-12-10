public abstract class Mascota {
    private String nombre;
    private Persona dueño;

    public Mascota(String nombre, Persona dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    abstract String saludo(Persona dueño);

}
