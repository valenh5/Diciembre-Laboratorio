public abstract class Componentes {
    private String modelo;
    private String fabricante;
    private int precio;
    private int stock;

    public Componentes(String modelo, String fabricante, int precio, int stock) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precio = precio;
        this.stock = stock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
