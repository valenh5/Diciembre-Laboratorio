package Elecciones;

import java.time.LocalDate;
import java.util.HashSet;

public class MainElecciones {
    public static void main(String[] args) {
        HashSet<Campaña> enviadores = new HashSet<>();

        PalomaMensajera paloma1 = new PalomaMensajera("Paloma1", "Blanca", "Mensajera", true);
        PalomaMensajera paloma2 = new PalomaMensajera("Paloma2", "Negra", "Mensajera", false);

        Telefono telefono1 = new Telefono(123, "Samsung", "Galaxy", CompañiaTelefonica.MOVISTAR, 11223344, 50, true);
        Telefono telefono2 = new Telefono(124, "Nokia", "Lumia", CompañiaTelefonica.TUENTI, 22334455, 0, true);

        HashSet<LocalDate> horario = new HashSet<>();
        horario.add(LocalDate.now());
        Trabajador trabajador1 = new Trabajador("Juan", "Perez", 30, 12345678, 50000, "Calle Falsa 123", horario);
        Trabajador trabajador2 = new Trabajador("Ana", "Lopez", 25, 87654321, 40000, "Av. Siempre Viva 742", new HashSet<>());

        PartidoPolitico partido = new PartidoPolitico(1000, "Calle Politica 456", "Partido A", enviadores);

        partido.agregarMensajero(paloma1);
        partido.agregarMensajero(paloma2);
        partido.agregarMensajero(telefono1);
        partido.agregarMensajero(telefono2);
        partido.agregarMensajero(trabajador1);
        partido.agregarMensajero(trabajador2);

        partido.hacerCampaña();
    }
}
