import java.time.LocalDate;

public class Bajo extends Paciente implements PacienteCapacitado{
    private int tolerancia;
    private static int alturaMin = 140;

    public Bajo(String nombre, String apellido, LocalDate nacimiento, Sexo sexo, int altura, int tolerancia) {
        super(nombre, apellido, nacimiento, sexo, altura);
        this.tolerancia = tolerancia;
    }

    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public static int getAlturaMin() {
        return alturaMin;
    }

    public static void setAlturaMin(int alturaMin) {
        Bajo.alturaMin = alturaMin;
    }

    @Override
    public boolean esApto() {
        if(getAltura()>alturaMin){
            System.out.println("Tu tratamiento tardara esta antidad de dias: " + getTolerancia() * 2);
            return true;
        }else{
            System.out.println("Lo sentimos no es apto para el tratamiento, es muy enano");
            return false;
        }
    }

    @Override
    public int precio() {
        return getTolerancia() * 235000;
    }
}
