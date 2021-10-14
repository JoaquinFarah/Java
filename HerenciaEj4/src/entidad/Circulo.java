package entidad;

import interfaz.calculosFormas;

public class Circulo implements calculosFormas {

    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double perimetro) {
        this.diametro = perimetro;
    }

    @Override
    public Double calcularArea() {
        Double area;
        area = calculosFormas.PI * (Math.pow(radio, 2));
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro;
        perimetro = calculosFormas.PI * diametro;
        return perimetro;
    }
}
