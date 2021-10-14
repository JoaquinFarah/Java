package SuperClase;

public class Animal {

    protected String nombre;
    protected String alimento;
    protected String raza;
    protected Integer edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void alimentacion(String nombre, String raza) {

        System.out.println("Animalito " + nombre + ", es un " + raza + " y su alimentacion es: " + alimento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre= " + nombre + ", alimento= " + alimento + ", raza= " + raza + ", edad= " + edad + '}';
    }

}
