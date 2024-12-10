import java.time.LocalDate;

public class Alto extends Paciente{
    public Alto(String nombre, String apellido, LocalDate nacimiento, Sexo sexo, int altura) {
        super(nombre, apellido, nacimiento, sexo, altura);
    }
}
