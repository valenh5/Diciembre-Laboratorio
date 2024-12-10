import java.time.LocalDate;
import java.util.ArrayList;

public class Bebida {
    private String marca;
    private ArrayList<Camion> distribucion;
    private int codigoBarra;
    private boolean gasificada;
    private LocalDate vencimiento;

    public Bebida(String marca, ArrayList<Camion> distribucion, int codigoBarra, boolean gasificada, LocalDate vencimiento) {
        this.marca = marca;
        this.distribucion = distribucion;
        this.codigoBarra = codigoBarra;
        this.gasificada = gasificada;
        this.vencimiento = vencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Camion> getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(ArrayList<Camion> distribucion) {
        this.distribucion = distribucion;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public boolean isGasificada() {
        return gasificada;
    }

    public void setGasificada(boolean gasificada) {
        this.gasificada = gasificada;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }
}
