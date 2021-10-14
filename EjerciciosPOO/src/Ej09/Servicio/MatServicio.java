package Ej09.Servicio;

public class MatServicio {

    public void crearNumero(double num1) {
        
        hoja.setNum1=((Math.random() * 10000) + 1);
        
        
    }

    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
    //valor
    public double devolverMayor(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("El n° " + num1 + " es mayor que el n° " + num2);
            return num1;
        } else {
            System.out.println("El n° " + num2 + " es mayor que el n° " + num1);
            return num2;
        }
    }

    //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(double num1, double num2) {
//        double aux1=Math.round(num1);
//        System.out.println("potencia" +aux1);
        double aux1 = num1;
        double roundDbl = num1 + num2;
        System.out.println("Rounded Double value: " + roundDbl);

    }

}
