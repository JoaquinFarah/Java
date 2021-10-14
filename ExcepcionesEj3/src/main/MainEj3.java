package main;

import java.util.Scanner;

public class MainEj3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra = "gato";
        System.out.println("valor invertido " + geringoso(palabra));
    }

    public static String geringoso(String palabra) {
        String aux = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            aux=palabra.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
        }
        
//        
//        
//        
//        for (int i = 0; i < palabra.length(); i++) {
//
//            switch (palabra.substring(i, i + 1)) {
//                case "a": {
//                    aux += palabra.substring(i, i + 1) + "pa";
//                    break;
//                }
//                case "e": {
//                    aux += palabra.substring(i, i + 1) + "pe";
//                    break;
//                }
//                case "i": {
//                    aux += palabra.substring(i, i + 1) + "pi";
//                    break;
//                }
//                case "o": {
//                    aux += palabra.substring(i, i + 1) + "po";
//                    break;
//                }
//                case "u": {
//                    aux += palabra.substring(i, i + 1) + "pu";
//                    break;
//
//                }
//                default: {
//                    aux += palabra.substring(i, i + 1);
//
//                }
//            }
//        }
        return aux;
    }
}
