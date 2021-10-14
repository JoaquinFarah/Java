package Servicio;

import Entidad.Mes;
import java.util.Scanner;

public class EjEx5Servicio {

    int c = 0;
    Mes mes = new Mes();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void adivinaMes() {
        System.out.println("Adivine el mes!");
        System.out.println("-mes secreto- " + mes.getMesSecreto());

        do {
            String adivina = leer.next();
            if (adivina.equals(mes.getMesSecreto())) {
                System.out.println("Adivinaste!");
                c = c + 1;

            } else {
                System.out.println("Nop, vuelve a interntarlo...");
            }

        } while (c == 0);
    }

}
