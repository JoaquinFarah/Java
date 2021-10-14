package Entidad;
public class Mes {
    String array [] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = array [(int) (Math.random() * 11)];

    public String[] getMes() {
        return array;
    }
    public String getMesSecreto() {
        return mesSecreto;
    }
    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
