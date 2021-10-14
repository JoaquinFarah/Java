package Entidad;

public class Ej2Alumno {

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", 1°nota = " + nota1 + ", 2°nota = " + nota2 + ", 3°nota = " + nota3 + '}';
    }
    
    private String nombre;
    private Integer nota1, nota2, nota3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    public Ej2Alumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Ej2Alumno() {
    }
    
}
