package Elecciones;

public abstract class Dispositivo {
    private int numSerie;
    private String fabricante, modelo;

    public Dispositivo(int numSerie, String fabricante, String modelo) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
