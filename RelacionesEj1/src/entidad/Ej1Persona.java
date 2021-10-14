package entidad;

import java.util.Objects;

public class Ej1Persona {
    private String nombre;
    private String apellido;   
    private Integer edad;
    private Integer DNI;
    private Ej1Perro perro;

    public Ej1Persona() {
    }

    public Ej1Persona(String nombre, String apellido, Integer edad, Integer DNI, Ej1Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public Ej1Perro getPerro() {
        return perro;
    }

    public void setPerro(Ej1Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

   
    @Override
    public String toString() {
        return "Dueños{" + "nombre= " + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perro=" + perro + '}';
    }

}
