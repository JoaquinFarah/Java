//Programa Nespresso. Desarrolle una clase Cafetera con los atributos 
//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y 
//cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//menos, los siguientes métodos:   
//•- Constructor predeterminado o vacío
//•- Constructor con la capacidad máxima y la cantidad actual
//•- Métodos getters y setters.
//•- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//•- Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//•- Método vaciarCafetera(): pone la cantidad de café actual en cero.
//•- Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package Ej06;
import java.util.Scanner;
public class Nespresso {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int capacidadMaxima, cantidadActual=0, capacidadTaza, masCafe, n;
        
        System.out.println("Capacidad maxima de la cafetera");
        capacidadMaxima=leer.nextInt();

        Cafetera cafetera1 = new Cafetera(capacidadMaxima, cantidadActual);
         
        do{
            System.out.println("Nespresso");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Cantidad actual");
            System.out.println("6. Salir");
            n=leer.nextInt();
            
            switch (n){
                case 1:
                    cafetera1.llenarCafetera(capacidadMaxima, cantidadActual);
                    System.out.println("Cafetera llena! " +cafetera1.getCapacidadMaxima()+ "lts");
                    break;
                case 2:
                    System.out.println("Tamaño de la taza?");
                    capacidadTaza=leer.nextInt();
                    cafetera1.servirTaza(capacidadTaza);
                    break;
                case 3:
                    cafetera1.vaciarCafetera();
                    System.out.println("Vaciando la cafetera..." +cafetera1.getCantidadActual()+ "lts");
                    break;
                case 4:
                    System.out.println("Agregue cafe (max=" +cafetera1.getCapacidadMaxima()+")");
                    masCafe=leer.nextInt();
                    cafetera1.agregarCafe(masCafe);
                    break;
                case 5:
                    System.out.println("Cantidad actual de cafe en la cafetera: " +cafetera1.getCantidadActual() );
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                }
        } while (n<6);
    }
}
