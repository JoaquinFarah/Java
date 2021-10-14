package Ej07;
public class Persona {
    String nombre, sexo;
    int edad;
    double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;      
    }

    public String getSexo() {
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")){
        return sexo;
        } else {
            return "ERROR";
        }      
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        if (sexo.equals("H") && sexo.equals("M") && sexo.equals("O")) {
            this.sexo = sexo;
        } else {
            System.out.println("ERROR");
        }
    }

    public void calcularIMC(double IMC, int a, int b, int c) {
        IMC = peso / (altura * altura);
        if (IMC < 20) {
            System.out.println("IMC = Desnutricion nivel 1");
            a = a + 1;
        }
        if (IMC >= 20 && IMC <= 25) {
            System.out.println("IMC = Peso ideal");
            b = b + 1;
        }
        if (IMC > 25) {
            System.out.println("IMC = Tiene sobrepeso nivel 1");
            c = c + 1;
        }

    }

    public void esMayorDeEdad(boolean mEdad, int adulto, int menor) {
        if (edad >= 18) {            
            adulto = adulto + 1;
            mEdad=true;
            System.out.println(mEdad);
        } else {
            menor = menor + 1;
            
            System.out.println(mEdad);
        }
    }

}
