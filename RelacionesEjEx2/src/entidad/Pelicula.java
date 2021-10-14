package entidad;

public class Pelicula {

    private Integer duracion;
    private Integer edadMinima;
    private String Titulo;
    private String Director;

    public Pelicula() {
    }

    public Pelicula(Integer duracion, Integer edadMinima, String Titulo, String Director) {
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.Titulo = Titulo;
        this.Director = Director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", edadMinima=" + edadMinima + ", Titulo=" + Titulo + ", Director=" + Director + '}';
    }

}
