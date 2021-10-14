package Entidad;

public class Ahorcado {
    private int letrasEncontradas;
    private int cantidadJugadas;
    private int longi;
    private String palabra;
    
    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int cantidadJugadas, int longi, String palabra) {
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
        this.longi = longi;
        this.palabra = palabra;
    }    
    
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
