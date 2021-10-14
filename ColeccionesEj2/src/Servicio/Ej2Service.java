package Servicio;

import Entidad.Ej2Alumno;
import java.util.*;

public class Ej2Service {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Ej2Alumno> listaAlumnos = new ArrayList<>();
    
    public void crearAlumno() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("1° nota: ");
        int nota1 = leer.nextInt();
        System.out.println("2° nota: ");
        int nota2 = leer.nextInt();
        System.out.println("3° nota: ");
        int nota3 = leer.nextInt();
        Ej2Alumno alumno = new Ej2Alumno(nombre, nota1, nota2, nota3);
        agregarAlumno(alumno);
    }

    public void agregarAlumno(Ej2Alumno alumno) {
        listaAlumnos.add(alumno);
        System.out.println("Desea agregar otro alumno? S/N");
        String option = leer.next().toUpperCase();
        if (option.equals("S")) {
            crearAlumno();
        } else {
            mostrarAlumnos();
        }
    }
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno para ver su nota final");
        String encontrar = leer.next();

        Iterator<Ej2Alumno> it = listaAlumnos.iterator();
                
        while (it.hasNext()) {
            encontrar = it.next().getNombre();
            if (encontrar.equals(listaAlumnos.))
        }
    }
        
    
//    public void mostrarAlumnos(){
//        for (Ej2Alumno listaAlumnos : listaAlumnos) {
//            System.out.println(listaAlumnos);
//            
//        }
        
    
    
}
