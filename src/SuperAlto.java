import java.time.LocalDate;

public class SuperAlto extends Paciente implements PacienteCapacitado{
    private static int alturaMax = 210;

    public SuperAlto(String nombre, String apellido, LocalDate nacimiento, Sexo sexo, int altura) {
        super(nombre, apellido, nacimiento, sexo, altura);
    }

    public static int getAlturaMax() {
        return alturaMax;
    }

    public static void setAlturaMax(int alturaMax) {
        SuperAlto.alturaMax = alturaMax;
    }

    @Override
    public boolean esApto() {
        if(getAltura()<getAlturaMax()){
            System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
            return true;
        }else{
            System.out.println("Lamentamos comunicarte que tu altura aún no va a poder ser modificada” y sino");
            return false;
        }
    }

    @Override
    public int precio() {
        if(getAltura()<200){
            return 1000000;
        }else{
            int cantidad = getAltura()-200;
            return 1000000 * cantidad; //retorna un millon por cada cm mayor a 200
        }
    }
}
