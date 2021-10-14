package Ej06;
public class Cafetera {
    int capacidadMaxima, cantidadActual;

    public Cafetera() {
    }
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void llenarCafetera(int capacidadMaxima, int cantidadActual){
        this.cantidadActual=capacidadMaxima;
    }        
    public void servirTaza(int capacidadTaza){
        if (cantidadActual>=capacidadTaza){
            this.cantidadActual=cantidadActual-capacidadTaza;
            System.out.println("Taza llena");
        }else{
            if (cantidadActual<capacidadTaza){
                capacidadTaza=cantidadActual;
                System.out.println("Taza a medias " +capacidadTaza);
                cantidadActual=0;
            }
        }
    }
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    public void agregarCafe(int masCafe){
        this.cantidadActual=cantidadActual+masCafe;
    }
}
