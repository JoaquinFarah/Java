//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
//en los atributos del objeto. Después, a través de otro método calcular y devolver la
//distancia que existe entre los dos puntos que existen en la clase Puntos. 
package ejex2;

import ejex2.Entidad.Puntos;
import ejex2Servicio.Servicio;
import java.util.Scanner;

public class EjEx2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Puntos pts = new Puntos();
        Servicio servicio = new Servicio();
        double x1, y1, x2, y2;

        System.out.println("X1");
        x1 = leer.nextDouble();
        pts.setX1(x1);
        System.out.println("X2");
        x2 = leer.nextDouble();
        pts.setX2(x2);
        System.out.println("Y1");
        y1 = leer.nextDouble();
        pts.setY1(y1);
        System.out.println("Y2");
        y2 = leer.nextDouble();
        pts.setY2(y2);

        System.out.println(pts.getX1());
        System.out.println(pts.getX2());
        System.out.println(pts.getY1());
        System.out.println(pts.getY2());

        servicio.calcular(x1, y1, x2, y2);
    }
}
