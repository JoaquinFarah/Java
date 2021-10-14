package entidad;

import SuperClase.Animal;

public class Perro extends Animal {

    @Override
    public String toString() {
        return "Perro{" + '}';
    }

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    
    

}
