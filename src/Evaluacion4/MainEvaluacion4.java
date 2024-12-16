package Evaluacion4;

import Evaluacion4.EmpleadoEstacion;
import Evaluacion4.EmpresaCombustible;
import Evaluacion4.FaltaCombustibleException;
import Evaluacion4.Surtidor;

import java.util.HashMap;
import java.util.HashSet;

public class MainEvaluacion4 {
    public static void main(String[] args) {
        EmpleadoEstacion empleado1 = new EmpleadoEstacion("Pablo", "Perez", 12, 123);
        EmpleadoEstacion empleado2 = new EmpleadoEstacion("Mariano", "Uavdocx", 54, 3284);
        HashMap<Combustible, Integer> combustiblesMain = new HashMap<>();
        combustiblesMain.put(Combustible.Gasoil, 10);
        combustiblesMain.put(Combustible.Infinia, 100);
        HashSet<EmpleadoEstacion> empleadosMain = new HashSet<>();
        empleadosMain.add(empleado1);
        empleadosMain.add(empleado2);
        Surtidor surtidor = new Surtidor(1, combustiblesMain);
        Surtidor surtidor2 = new Surtidor(2, combustiblesMain);
        Surtidor surtidor3 = new Surtidor(3, combustiblesMain);
        Surtidor surtidor4 = new Surtidor(4, combustiblesMain);
        HashSet<Surtidor> surtidores1 = new HashSet<>();
        HashSet<Surtidor> surtidores2 = new HashSet<>();
        surtidores1.add(surtidor);
        surtidores1.add(surtidor2);
        surtidores2.add(surtidor3);
        surtidores2.add(surtidor4);
        SucursalEstacion sucursalUrquiza = new SucursalEstacion(empleadosMain, surtidores1, 1000);
        SucursalEstacion sucursalShell = new SucursalEstacion(empleadosMain, surtidores2, 5648790);
        HashSet<SucursalEstacion> sucursales = new HashSet<>();
        sucursales.add(sucursalShell);
        EmpresaCombustible shell = new EmpresaCombustible("Shell", sucursales);


        try {
            sucursalUrquiza.cargarCombustible(Combustible.Gasoil, 35, 1);
        } catch (FaltaCombustibleException e) {
            e.getMessage();
        }
        System.out.println(shell.recogerGanancias());
    }
}
