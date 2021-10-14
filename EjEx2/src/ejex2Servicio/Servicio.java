package ejex2Servicio;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public double calcular(double x1, double y1, double x2, double y2) {
        double x = x1 - x2;
        double y = y1 - y2;

        double distancia = (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double truncar = Math.pow(10, 2);
        distancia = Math.round(distancia * truncar) / truncar;
        System.out.println("Distancia " + distancia);
        return distancia;
    }
}
