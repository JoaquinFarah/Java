//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
//medida que el usuario las va ingresando, construya una “sopa de letras para niños”
//de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
//horizontal en una fila que será seleccionada de manera aleatoria. Una vez
//concluida la ubicación de las palabras, rellene los espacios no utilizados con un
//número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
//creada.  
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
//funciones de Java substring(), Length() y Math.random().  
package Ejercicios;
import java.util.Scanner;
public class ej_ex_22 
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        String palabra;
//        int[][]matrix = new int [20][20];
//        int num;
//        
//        System.out.println("Sopa de letras");
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese palabras");
//            palabra=leer.next();
//            
//        
//        }
//        
//    }
//    
//}


{

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int contador = 0;
        String[][] matriz = new String[20][20];
        do {
            System.out.print("Ingrese la palabra " + (contador + 1) + ":");
            palabra = leer.next();
            int l = palabra.length();
            if (palabra.length() >= 3 && palabra.length() <= 5) {
                contador++;
            }
            int f = 0, c = 0;
            for (int aux = 0; aux < 1; aux++) {
                f = (int) (Math.random() * (19 - 0 + 1) + 0);
                c = (int) (Math.random() * ((20 - palabra.length()) - 0 + 1) + 0);
                if (matriz[f][c] != null) {
                    aux = -1;
                }
            }
            int k=0;
            for (int j = c; j < c+l; j++) {
                matriz[f][j] = palabra.substring(k,k+1 );
                k++;
            }
        } while (palabra.length() < 3 || palabra.length() > 5 || contador < 5);

        cargarelemento(matriz);
        mostrarmatriz(matriz);
        

    }
//---------------------------------------------------------------------------//
    public static void cargarelemento(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    int random = (int) (Math.random() * (9 - 0 + 1) + 0);
                    matriz[i][j] = String.valueOf(random);
                }
            }
        }
    }
//---------------------------------------------------------------------------//
    public static void mostrarmatriz(String[][] matriz){
        System.out.println("SOPA DE LETRAS");
        for (String[] fila : matriz) {
            String aux = "";
            for (String elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
    }
//---------------------------------------------------------------------------//
}
