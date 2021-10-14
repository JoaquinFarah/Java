package Ej08.Servicio;

public class Servicio {

    public void mostrarVocales(String frase) {
        int c = 0;
        frase = frase.toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'A') || (frase.charAt(i) == 'E') || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O') || (frase.charAt(i) == 'U')) {
                c = c + 1;
            }
        }
        System.out.println("La cantidad de vocales es: " + c);
    }

    public void invertirFrase(String frase) {
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(String frase, char letra) {
        int c = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                c = c + 1;
            }
        }
        System.out.println("En la frase= " + frase + ". Cantidad de veces que la letra [" + letra + "] se repite: " + c);
    }

    public void compararLongitud(String frase1, String frase) {

        if (frase.length() == frase1.length()) {
            System.out.println("Tienen la misma longitud");
        } else if (frase.length() > frase1.length()) {
            System.out.println("La primera frase es mas larga");
        } else {
            System.out.println("La segunda frase es mas larga");
        }
    }

    public void unirFrases(String frase, String frase1) {
        String frases = frase.concat(frase1);
        System.out.println("Frases concatenadas " + frases);
    }

    public void reemplazar(String frase, char reemp) {
        frase = frase.toUpperCase();
        System.out.println(frase.replace('A', reemp));

    }

    public boolean contiene(String frase, String cont) {
        if (frase.contains(cont)) {
            return true;
        } else {
            return false;
        }

    }

}
