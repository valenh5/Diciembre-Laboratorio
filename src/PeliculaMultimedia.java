public class PeliculaMultimedia extends Multimedia{
    private Persona actorPrincipal;
    private Persona actrizPrincipal;

    public PeliculaMultimedia(String titulo, Persona autor, int duracion, FormatoMultimedia formato, Persona actorPrincipal, Persona actrizPrincipal) {
        super(titulo, autor, duracion, formato);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public Persona getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Persona actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public Persona getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(Persona actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }
}
