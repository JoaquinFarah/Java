package entidad;

import SuperClase.Animal;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public String toString() {
        return "Gato{" + '}';
    }
    
}
