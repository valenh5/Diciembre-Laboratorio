public class DispositivoEntrada extends Componentes{
    private String tipoConector;
    private String puertos;

    public DispositivoEntrada(String modelo, String fabricante, int precio, int stock, String tipoConector, String puertos) {
        super(modelo, fabricante, precio, stock);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }
}
