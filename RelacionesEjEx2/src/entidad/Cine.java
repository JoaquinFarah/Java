package entidad;

public class Cine {

    private String pelicula;
    private Double precio;
    private Espectador sala[][], new Espectador[8][6];

    public Cine() {
    }

    public Cine(String pelicula, Double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + '}';
    }

}
