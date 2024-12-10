//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;

public class MainEvaluacion3 {
    public static void main(String[] args) {
        SistemaClub sistemaAccesoSocios = new SistemaClub();
        Activo activoUno = new Activo("Sucio", "Santillan", LocalDate.now(), 47962383, 2020, 100000);
        Activo activoDos = new Activo("Uavdox", "Uavdox", LocalDate.now(), 45292094, 2040, 100001);
        Pasivo pasivoUno = new Pasivo("Valentin", "Huerga", LocalDate.now(), 47540202, 2060, 500000);
        Pasivo pasivoDos = new Pasivo("Uavdox", "Uavdox", LocalDate.now(), 46080777, 2080, 500001);
        Junior juniorUno = new Junior("Hernan", "Woody", LocalDate.now(), 47864992, 3000, 75000);
        Junior juniorDos = new Junior("Gonza", "Gonza", LocalDate.now(), 47064123, 3020, 75001);
        sistemaAccesoSocios.agregarSocio(activoUno);
        sistemaAccesoSocios.agregarSocio(activoDos);
        sistemaAccesoSocios.agregarSocio(pasivoUno);
        sistemaAccesoSocios.agregarSocio(pasivoDos);
        sistemaAccesoSocios.agregarSocio(juniorUno);
        sistemaAccesoSocios.agregarSocio(juniorDos);
        sistemaAccesoSocios.ingresoSocio(47962383, Actividad.VOLLEY);
        sistemaAccesoSocios.ingresoSocio(47962383, Actividad.REMO);
        sistemaAccesoSocios.ingresoSocio(45292094, Actividad.REMO);
        sistemaAccesoSocios.ingresoSocio(47540202, Actividad.FUTBOL);
        sistemaAccesoSocios.ingresoSocio(46080777, Actividad.AJEDREZ);
        sistemaAccesoSocios.ingresoSocio(47864992, Actividad.FUTBOL);
        sistemaAccesoSocios.ingresoSocio(47064123, Actividad.ESGRIMA);
        sistemaAccesoSocios.ingresoSocio(47064123, Actividad.REMO);
        sistemaAccesoSocios.vecesQueIngresoAlClub(activoUno);
        sistemaAccesoSocios.vecesQueIngresoAlClub(pasivoDos);
        sistemaAccesoSocios.vecesQueIngresoAlClub(juniorDos);
    }
}
