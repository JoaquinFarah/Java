package Servicio;

import Entidad.Ej5Pais;
import java.util.*;

public class Ej5Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<Ej5Pais> listaPaises = new TreeSet<>();

    public void crearPais() {
        Ej5Pais pais = new Ej5Pais();
        String nombre;

        System.out.println("Nombre del pais");
        pais.setNombre(nombre = leer.next());

        agregarPais(pais);

        System.out.println("Agregar otro pais? S/N");
        String op = leer.next().toUpperCase();
        if (op.equals("S")) {
            crearPais();
        } else {
            mostrarPaises();

        }
    }

    public void agregarPais(Ej5Pais p) {
        listaPaises.add(p);
    }
    
    public void mostrarPaises(){
        System.out.println("Paises ordenados");
        for (Ej5Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPais(String p){
        Iterator<Ej5Pais> it = listaPaises.iterator();
        
        while (it.hasNext()){
            if(it.next().getNombre().equalsIgnoreCase(p)){
                it.remove();
            }
        }
        System.out.println("Pais Eliminado");
        mostrarPaises();
        
    }

}
