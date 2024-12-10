public abstract class Multimedia {
    private String titulo;
    private Persona autor;
    private int duracion;
    private FormatoMultimedia formato;

    public Multimedia(String titulo, Persona autor, int duracion, FormatoMultimedia formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public FormatoMultimedia getFormato() {
        return formato;
    }

    public void setFormato(FormatoMultimedia formato) {
        this.formato = formato;
    }
}
