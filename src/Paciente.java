import java.time.LocalDate;

public class Paciente {
    private String nombre, apellido;
    private LocalDate nacimiento;
    private Sexo sexo;
    private int altura;

    public Paciente(String nombre, String apellido, LocalDate nacimiento, Sexo sexo, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
