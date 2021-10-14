package servicio;

import entidad.Ej1Perro;
import entidad.Ej1Persona;
import enumeracion.Raza;
import enumeracion.Tamanio;
import java.util.*;

public class Ej1Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Ej1Persona> listaPersona = new ArrayList();
    int c = 0;

    private Ej1Persona crearPersona() {
        Ej1Persona p1 = new Ej1Persona();
        System.out.println("Datos del dueño \n"
                + "Nombre");
        String nombre = leer.next();
        System.out.println("Apellido ");
        String apellido = leer.next();
        System.out.println("Edad");
        Integer edad = leer.nextInt();
        System.out.println("DNI");
        Integer DNI = leer.nextInt();
        System.out.println("Datos del perro");
        
        return new Ej1Persona(nombre, apellido, edad, DNI, crearPerro());
    }

    public void sumarPersona() {
        do {
            listaPersona.add(crearPersona());
            System.out.println("desea sumar otro?");
            String op = leer.next();
            if (op.equalsIgnoreCase("S")) {
                sumarPersona();
            } else {
                c = c + 1;
            }
        } while (c == 0);

    }

    public void mostrarPersona() {
        for (Ej1Persona aux : listaPersona) {
            System.out.println("Lista Personas" + aux);
        }
    }
    ArrayList<Ej1Perro> listaPerro = new ArrayList();
    
    private Ej1Perro crearPerro() {
        Ej1Perro perro = new Ej1Perro();
        System.out.println("Datos del Perro");
        System.out.println("Nombre");
        String nombre = leer.next();
        System.out.println("Raza");
        for (Raza raza : Raza.values()) {
            System.out.println(raza.ordinal() + "+" +raza);           
        }
        Raza raza = Raza.values()[leer.nextInt()];
                
        System.out.println("Edad");
        Integer edad = leer.nextInt();
        System.out.println("Tamaño");
        for (Tamanio tamanio : Tamanio.values()) {
            System.out.println(tamanio.ordinal() + "+" +tamanio);            
        }
        Tamanio tamanio = Tamanio.values()[leer.nextInt()];

        return new Ej1Perro(nombre, raza, edad, tamanio);
    }
}



//    public void sumarPerro() {
//        do {
//            listaPerro.add(crearPerro());
//            System.out.println("desea sumar otro?");
//            String op = leer.next();
//            if (op.equalsIgnoreCase("S")) {
//                sumarPerro();
//            } else {
//                c = c + 1;
//            }
//        } while (c == 0);
//    }
//
//    public void mostrarPerro() {
//        for (Ej1Perro aux : listaPerro) {
//            System.out.println("Lista Perro" + aux);
//        }
//    }

