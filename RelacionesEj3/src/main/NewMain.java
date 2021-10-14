package main;

import java.util.*;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ej3Main mazo = new Ej3Main();

        int op = 0, c = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Elija su mazo de cartas");
            System.out.println("2. Barajar");
            System.out.println("3. Siguiente carta");
            System.out.println("4. Pedir un numero determinado de cartas");
            System.out.println("5. Cartas disponibles en el mazo");
            System.out.println("6. Cartas en la pila de descarte");
            System.out.println("7. Mostrar el resto de la baraja ");
            System.out.println("8. Salir");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    mazo.crearBaraja();
                    break;
                case 2:
                    mazo.barajar();
                    break;
                case 3:
                    mazo.siguienteCarta();
                    break;
                case 4:
                    mazo.darCarta();
                    break;
                case 5:
                    mazo.cartasDisponibles();
                    break;
                case 6:
                    mazo.cartasMonton();
                    break;
                case 7:
                    mazo.mostrarBaraja();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    c = c + 1;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (c == 0);

    }
}
