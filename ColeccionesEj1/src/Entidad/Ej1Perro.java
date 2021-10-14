package Entidad;

public class Ej1Perro {

    private String raza;
    private String nombre;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ej1Perro(String nombre, String raza) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public Ej1Perro() {
    }

    @Override
    public String toString() {
        return "Ej1Perro{" + "Raza= " + raza + ", Nombre= " + nombre + '}';
    }

    
}
