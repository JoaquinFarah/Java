package entidad;

import SuperClase.Animal;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public String toString() {
        return "Caballo{" + '}';
    }

   

}
