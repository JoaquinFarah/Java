package entidad;

public class Espectador {

    private String nombre;
    private Integer edad;
    private Boolean dinero;

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getDinero() {
        return dinero;
    }

    public void setDinero(Boolean dinero) {
        this.dinero = dinero;
    }

    public Espectador(String nombre, Integer edad, Boolean dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Espectador() {
    }

}
