package servicio;

import java.util.*;
import superClase.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

public class ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Electrodomestico> listaElectro = new ArrayList();

    public void compras() {
        int contLavadora = 0;
        int preLavadora = 0;
        int contTele = 0;
        int preTele = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Para televisores presione 1, Para lavadoras presione 2");
            int op = leer.nextInt();
            if (op == 1) {
                Televisor tele = new Televisor();
                tele.crearTelevisor();
                tele.precioFinal();
                System.out.println(tele.toString());
                listaElectro.add(tele);
                contTele = contTele + 1;
                preTele = preTele + tele.getPrecio();
            } else {
                Lavadora lavadora = new Lavadora();
                lavadora.crearLavadora();
                lavadora.precioFinal();
                System.out.println(lavadora.toString());
                listaElectro.add(lavadora);
                contLavadora = contLavadora + 1;
                preLavadora = preLavadora + lavadora.getPrecio();
            }
        }

        System.out.println("------Lista electrodomesticos------");
        for (Electrodomestico aux : listaElectro) {
            System.out.println(aux);
            System.out.println(" ");

        }
        System.out.println("***Compras discriminadas***");
        System.out.println("Televisores");
        System.out.println("Precio total televisores =$" + preTele);
        System.out.println("Cantidad de televidores " + contTele);
        System.out.println("Precio total lavadoras =$" + preLavadora);
        System.out.println("Cantidad de lavadoras " + contLavadora);
    }
}
