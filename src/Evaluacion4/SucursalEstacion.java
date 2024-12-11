package Evaluacion4;

import Evaluacion4.EmpleadoEstacion;
import Evaluacion4.FaltaCombustibleException;
import Evaluacion4.Surtidor;

import java.util.HashSet;

public class SucursalEstacion {
    private HashSet<EmpleadoEstacion> empelados;
    private HashSet<Surtidor> surtidores;
    private int dineroRecaudado;

    public SucursalEstacion(HashSet<EmpleadoEstacion> empelados, HashSet<Surtidor> surtidores, int dineroRecaudado) {
        this.empelados = empelados;
        this.surtidores = surtidores;
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<EmpleadoEstacion> getEmpelados() {
        return empelados;
    }

    public void setEmpelados(HashSet<EmpleadoEstacion> empelados) {
        this.empelados = empelados;
    }

    public HashSet<Surtidor> getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(HashSet<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public int getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public void cargarCombustible(Combustible nafta, int cantLitros, int numSurtidor) throws FaltaCombustibleException {
        for(Surtidor surtidor : surtidores){
            if(surtidor.getNumero() == numSurtidor){
                surtidor.cargarCombustibleSurtidor(nafta, cantLitros);
                setDineroRecaudado(getDineroRecaudado() + nafta.getPrecio() * cantLitros);
            }
        }
    }
}
