//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes. 
package ejex1;

import Entidad.Cancion;
import java.util.ArrayList;
import java.util.Scanner;

public class EjEx1 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");   
     Cancion track1 = new Cancion();   
     
        System.out.println("Nombre del autor");
        String autor = leer.next();
        track1.setAutor(autor);
        System.out.println("Titulo de la cancion");
        String titulo = leer.next();
        track1.setTitulo(titulo);
        
        System.out.println("Autor " +track1.getAutor());
        System.out.println("Titulo " +track1.getTitulo());
        
        
        ArrayList<String> animalitos = new ArrayList();
        
        animalitos.
     
        
    }
    
}
