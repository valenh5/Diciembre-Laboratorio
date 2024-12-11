package Evaluacion4;

public enum Combustible {
    NaftaSuper(900),
    VPower (1100),
    Infinia (1090),
    Gasoil (1300);

    private int precio;

    // Constructor del enum
    Combustible(int precio) {
        this.precio = precio;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
