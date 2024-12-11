package Evaluacion5;

import Evaluacion5.*;

import java.time.LocalDate;
import java.util.HashSet;

public class MainEvaluacion5 {
    public static void main(String[] args) {
        SuperAlto superAlto1 = new SuperAlto("A", "B", LocalDate.now(), Sexo.HOMBRE, 190);
        SuperAlto superAlto2 = new SuperAlto("A", "B", LocalDate.now(), Sexo.HOMBRE, 208);
        SuperAlto superAlto3 = new SuperAlto("A", "B", LocalDate.now(), Sexo.HOMBRE, 220);
        Bajo bajo1 = new Bajo("A", "B", LocalDate.now(), Sexo.HOMBRE, 100, 5);
        Bajo bajo2 = new Bajo("A", "B", LocalDate.now(), Sexo.HOMBRE, 160, 7);
        Alto alto1 = new Alto("A", "B", LocalDate.now(), Sexo.HOMBRE, 190);
        HashSet<Paciente>pacientes = new HashSet<>();
        pacientes.add(superAlto1);
        pacientes.add(superAlto2);
        pacientes.add(superAlto3);
        pacientes.add(alto1);
        pacientes.add(bajo1);
        pacientes.add(bajo2);
        HashSet<PacienteCapacitado> pacienteCapacitados = new HashSet<>();
        pacienteCapacitados.add(superAlto1);
        pacienteCapacitados.add(superAlto2);
        pacienteCapacitados.add(superAlto3);
        pacienteCapacitados.add(bajo1);
        pacienteCapacitados.add(bajo2);
        superAlto1.esApto();
        superAlto2.esApto();
        superAlto3.esApto();
        bajo1.esApto();
        bajo2.esApto();
        superAlto1.precio();
        superAlto2.precio();
        superAlto3.precio();
        bajo1.precio();
        bajo2.precio();
        ClinicaAltura clinica = new ClinicaAltura("Suizo", pacientes, pacienteCapacitados);
        System.out.println("La cantidad de altos de la clinica es: " + clinica.cantidadAltos());
        System.out.println("El dinero recaudado por la clinica es: " + clinica.plataGanada());
    }
}
