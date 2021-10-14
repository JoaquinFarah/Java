package entidad;

import enumeracion.Raza;
import enumeracion.Tamanio;
import java.util.Objects;

public class Ej1Perro {
    private String nombre;
    private Raza raza;
    private Integer edad;
    private Tamanio tamanio;

    public Ej1Perro() {
    }

    public Ej1Perro(String nombre, Raza raza, Integer edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Ej1Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio" + tamanio + '}';
    }
    
    
    
}
