package Llamadas;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaLLamada {
    private HashSet<Empleado> empleados;
    private HashMap<Empleado, Llamada> llamadasEmpleados;

    public SistemaLLamada(HashSet<Empleado> empleados, HashMap<Empleado, Llamada> llamadasEmpleados) {
        this.empleados = empleados;
        this.llamadasEmpleados = llamadasEmpleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashMap<Empleado, Llamada> getLlamadasEmpleados() {
        return llamadasEmpleados;
    }

    public void setLlamadasEmpleados(HashMap<Empleado, Llamada> llamadasEmpleados) {
        this.llamadasEmpleados = llamadasEmpleados;
    }

    public void realizarLlamada(Empleado origen, Empleado destino, int duracion){

    }
}
