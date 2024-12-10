public class Vehiculo {
    private String marca;
    private String patente;
    private int cantRuedas;

    public Vehiculo(String marca, String patente, int cantRuedas) {
        this.marca = marca;
        this.patente = patente;
        this.cantRuedas = cantRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
