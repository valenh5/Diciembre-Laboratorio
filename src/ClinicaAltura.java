import java.util.HashSet;

public class ClinicaAltura {
    private String nombre;
    private HashSet<Paciente> pacientes;
    private HashSet<PacienteCapacitado> pacienteCapacitados;

    public ClinicaAltura(String nombre, HashSet<Paciente> pacientes, HashSet<PacienteCapacitado> pacienteCapacitados) {
        this.nombre = nombre;
        this.pacientes = pacientes;
        this.pacienteCapacitados = pacienteCapacitados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public HashSet<PacienteCapacitado> getPacienteCapacitados() {
        return pacienteCapacitados;
    }

    public void setPacienteCapacitados(HashSet<PacienteCapacitado> pacienteCapacitados) {
        this.pacienteCapacitados = pacienteCapacitados;
    }
    public int plataGanada(){
        int total = 0;
        for(PacienteCapacitado paciente : pacienteCapacitados){
            total = total + paciente.precio();
        }
        return total;
    }

    public int cantidadAltos(){
        int totalAltos = 0;
        for(Paciente paciente : pacientes){
            if(!pacienteCapacitados.contains(paciente)){
                totalAltos = totalAltos + 1;
            }
        }
        return totalAltos;
    }
}
