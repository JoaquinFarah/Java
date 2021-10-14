package main;

import entidad.Baraja;
import enumeracion.Palos;
import java.util.*;

public class Ej3Main {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Baraja> cartas = new ArrayList();
    private ArrayList<Baraja> descarte = new ArrayList();

    public void crearBaraja() {
        cartas.clear();
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Baraja(i, Palos.BASTO));
                cartas.add(new Baraja(i, Palos.COPA));
                cartas.add(new Baraja(i, Palos.ESPADA));
                cartas.add(new Baraja(i, Palos.ORO));
            }
        }
    }

    public void barajar() {
        System.out.println("Barajar");
        Collections.shuffle(cartas);
    }

    public void siguienteCarta() {
        for (Baraja aux : cartas) {
            System.out.println(aux);
            descarte.add(aux);
            cartas.remove(aux);
            break;
        }
    }

    public void darCarta() {
        System.out.println("Cuantas cartas quiere?");
        int c = leer.nextInt();
        if (c > cartas.size()) {
            System.out.println("No hay suficientes cartas");

        } else {
            for (int i = 1; i <= cartas.size(); i++) {
                System.out.println("Las cartas son: ");
                System.out.println(cartas.get(i));
                descarte.add(cartas.get(i));
                cartas.remove(i);
            }
        }
    }

    public void cartasDisponibles() {
        System.out.println(cartas.size() + " Quedan en la baraja");
    }

    public void cartasMonton() {
        if (descarte.size() == 0) {
            System.out.println("Aun no ha descartado ninguna");
        } else {
            System.out.println(descarte.size() + " Son las del monton de descarte");
            for (Baraja aux : descarte) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarBaraja() {
        for (Baraja aux : cartas) {
            System.out.println(aux);
        }
    }

}
