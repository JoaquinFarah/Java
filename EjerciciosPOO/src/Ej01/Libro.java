package Ej01;
import java.util.Scanner;
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //atributos
    int ISBN;
    String Titulo;
    String Autor;
    int NumPag;

    //metodo rellenado
    public void pedirDatos() {
        System.out.println("Ingrese ISBN");
        ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo");
        Titulo = leer.next();
        System.out.println("Ingrese Autor");
        Autor = leer.next();
        System.out.println("Ingrese cantidad de paginas");
        NumPag = leer.nextInt();
        System.out.println("");
    }
    //constructor vacio
    public void Libro (){
    }
    //constructor con parametros
    public void Libro (int ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo= Titulo;
        this.Autor=Autor;
        this.NumPag=NumPag;
    }
    //metodo para mostrar
    public void mostrarDatos (){
        System.out.println("ISBN " + ISBN);
        System.out.println("Titulo " +Titulo);
        System.out.println("Autor " +Autor);
        System.out.println("Cantidad de paginas " +NumPag);
    }
}