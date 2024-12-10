public class Impresora extends DispositivoSalida{
    private MetodoImpresion metodo;

    public Impresora(String modelo, String fabricante, int precio, int stock, int puerto, MetodoImpresion metodo) {
        super(modelo, fabricante, precio, stock, puerto);
        this.metodo = metodo;
    }

    public MetodoImpresion getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoImpresion metodo) {
        this.metodo = metodo;
    }
}
