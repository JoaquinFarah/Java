package Servicio;

import Entidad.Ej4Pelicula;
import static Servicio.Ej4Utilidad.peliculasAsc;
import static Servicio.Ej4Utilidad.peliculasDesc;
import static Servicio.Ej4Utilidad.peliculasDirector;
import static Servicio.Ej4Utilidad.peliculasTitulo;
import java.util.*;

public class Ej4Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Ej4Pelicula> listaPeliculas = new ArrayList<>();

    public void crearPelicula() {
        System.out.println("TITULO");
        String titulo = leer.next();
        System.out.println("DIRECTOR");
        String director = leer.next();
        System.out.println("DURACION");
        int duracion = leer.nextInt();

        Ej4Pelicula p = new Ej4Pelicula(titulo, director, duracion);
        agregarPelicula(p);
    }

    public void agregarPelicula(Ej4Pelicula p) {
        listaPeliculas.add(p);
        System.out.println("Desea crear una pelicula: S/N");
        String option = leer.next().toUpperCase();
        if (option.equals("S")) {
            crearPelicula();
        } else {
            System.out.println("Peliculas");
            mostrarPeliculas(listaPeliculas);
            System.out.println("Orden descendente");
            ordenarDesc(listaPeliculas);
            System.out.println("Orden Ascendente");
            ordenarAsc(listaPeliculas);
            System.out.println("Orden por titulo");
            ordenarTitulo(listaPeliculas);
            System.out.println("Orden por director");
            ordenarDirector(listaPeliculas);
            System.out.println("Duracion superior a 1 hora");
            mayoresHora(listaPeliculas);
        }
    }

    public void mostrarPeliculas(ArrayList<Ej4Pelicula> listaPeliculas) {
        for (Ej4Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarDesc(ArrayList<Ej4Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, peliculasDesc);
        for (Ej4Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarAsc(ArrayList<Ej4Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, peliculasAsc);
        for (Ej4Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }

    }

    public void ordenarTitulo(ArrayList<Ej4Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, peliculasTitulo);
        for (Ej4Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarDirector(ArrayList<Ej4Pelicula> listaPeliculas) {
        Collections.sort(listaPeliculas, peliculasDirector);
        for (Ej4Pelicula aux : listaPeliculas) {
            System.out.println(aux);

        }

    }

    public void mayoresHora(ArrayList<Ej4Pelicula> listaPeliculas) {
        for (Ej4Pelicula aux : listaPeliculas) {
            if (aux.getDuracion() >= 60) {
                System.out.println(aux);
            }
        }
    }

}
