package Entidad;

public class NIF {
    int DNI, aux;
    String letra;

    public NIF() {
    }

    public NIF(int DNI, int aux, String letra) {
        this.DNI = DNI;
        this.aux = aux;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}