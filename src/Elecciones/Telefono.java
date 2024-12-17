package Elecciones;

public class Telefono extends Dispositivo implements Campaña{
    private CompañiaTelefonica compañiaTelefonica;
    private int numero, credito;
    private boolean encendido;

    public Telefono(int numSerie, String fabricante, String modelo, CompañiaTelefonica compañiaTelefonica, int numero, int credito, boolean encendido) {
        super(numSerie, fabricante, modelo);
        this.compañiaTelefonica = compañiaTelefonica;
        this.numero = numero;
        this.credito = credito;
        this.encendido = encendido;
    }

    public CompañiaTelefonica getCompañiaTelefonica() {
        return compañiaTelefonica;
    }

    public void setCompañiaTelefonica(CompañiaTelefonica compañiaTelefonica) {
        this.compañiaTelefonica = compañiaTelefonica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public void hacerCampaña(String mensaje) {
        if(encendido){
            if(credito > 0){
                System.out.println("Conectando con la antena mas cercana");
                System.out.println(mensaje);
            }else{
                System.out.println("Credito insuficiente");
            }
        }else{
            System.out.println("No esta encendido");
        }
    }
}
