package excepcionesej2;

public class ExcepcionesEj2 {

    public static void main(String[] args) {
        int i = 0;
        int array[] = new int[2];

        try {

            for (i = 0; i < 4; i++) {
                array[i] = i;
                System.out.print("NOPE ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ");
            System.out.println("ERROR");   
            System.out.println(e.toString());
        }
    }
}
