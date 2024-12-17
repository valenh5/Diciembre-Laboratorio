package Elecciones;

public class PalomaMensajera extends Ave implements Campaña{
    private boolean aprendioMapa;

    public PalomaMensajera(String nombre, String color, String especie, boolean aprendioMapa) {
        super(nombre, color, especie);
        this.aprendioMapa = aprendioMapa;
    }

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void hacerCampaña(String mensaje) {
        if(aprendioMapa){
            System.out.println("Lanzando un papelito que dice: " + mensaje);
        }else{
            System.out.println("No puede volar, no aprendio el mapa");
        }
    }
}
