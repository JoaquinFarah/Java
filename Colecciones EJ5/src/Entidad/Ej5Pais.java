package Entidad;

import java.util.*;

public class Ej5Pais implements Comparable<Ej5Pais> {
    private String nombre;

    public Ej5Pais() {
    }

    public Ej5Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ej5Pais other = (Ej5Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ej5Pais{" + "nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(Ej5Pais p) {
        return this.nombre.compareTo(p.getNombre());
    }
    
    
    
    
}