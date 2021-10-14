package Servicio;

import Entidad.Ej1Perro;
import java.util.*;

public class Ej1Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Ej1Perro> listaPerros = new ArrayList<>();

    public void crearPerro() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese raza");
        String raza = leer.next();
        Ej1Perro p = new Ej1Perro(nombre, raza);
        agregarPerro(p);
    }

    public void agregarPerro(Ej1Perro p) {
        listaPerros.add(p);
        System.out.println("Desea agregar otro perro? S/N");
        String option = leer.next().toUpperCase();
        if (option.equals("S")) {
            crearPerro();
       
        } else {
            mostrarPerros();
        }
    }
    public void eliminarRepetidos(){
        Set<Ej1Perro> auxHashSet = new HashSet<Ej1Perro>(listaPerros);
        listaPerros.clear();
        listaPerros.addAll(auxHashSet);
        mostrarPerros();
    }

    public void mostrarPerros() {
        System.out.println("***Listado de Perros***");
        listaPerros.forEach((perro) -> System.out.println(perro.toString()));
        
    }

    public void encontrarPerro() {
        System.out.println("Que perro desea encontrar y eliminar de la lista?");
        String selection = leer.next();

        Iterator<Ej1Perro> it = listaPerros.iterator();

        while (it.hasNext()) {
            String borrar = it.next().getNombre();
            if (borrar.equals(selection)) {
                it.remove();
                mostrarPerros();
                break;
            } else {
                System.out.println("No se encuentra en la lista");
                mostrarPerros();
                break;
            }
        }
    }

}
