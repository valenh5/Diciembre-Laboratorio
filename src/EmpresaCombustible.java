import java.util.HashSet;

public class EmpresaCombustible {
    private String nombre;
    private HashSet<SucursalEstacion> sucursales;

    public EmpresaCombustible(String nombre, HashSet<SucursalEstacion> sucursales) {
        this.nombre = nombre;
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<SucursalEstacion> getSucursales() {
        return sucursales;
    }

    public void setSucursales(HashSet<SucursalEstacion> sucursales) {
        this.sucursales = sucursales;
    }

    public int recogerGanancias(){
        int cantidad = 0;
        try{
            for(SucursalEstacion sucursal : sucursales){
                cantidad += sucursal.getDineroRecaudado();
                sucursal.setDineroRecaudado(0);
            }
            if(cantidad == 0){
                throw new RecaudacionNulaException("La recaudacion fue nula");
            }
        }catch (RecaudacionNulaException e){
            e.getMessage();
        }
        return cantidad;
    }
}
