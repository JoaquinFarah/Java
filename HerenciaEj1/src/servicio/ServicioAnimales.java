package servicio;

import SuperClase.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.*;

public class ServicioAnimales {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarInfo() {
        
        Animal gato = new Gato("Turulo", "Gati", "Persa", 3);
        gato.alimentacion(gato.getNombre(), gato.getRaza());

        Gato g1 = new Gato("Irina", "CatChow", "Siames", 10);
        g1.alimentacion(g1.getNombre(), g1.getRaza());
       
        Perro p1 = new Perro("Seku", "Maximum", "Boxer", 8);
        p1.alimentacion(p1.getNombre(), p1.getRaza());
       
        Caballo c1 = new Caballo("Rapidash", "Pasto", "Percheron", 6);
        c1.alimentacion(c1.getNombre(), c1.getRaza());
       
        System.out.println(g1);
        System.out.println(p1);
        System.out.println(c1);
        System.out.println(gato);
    }

}
