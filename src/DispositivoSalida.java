public class DispositivoSalida extends Componentes{
    private int puerto;

    public DispositivoSalida(String modelo, String fabricante, int precio, int stock, int puerto) {
        super(modelo, fabricante, precio, stock);
        this.puerto = puerto;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}
