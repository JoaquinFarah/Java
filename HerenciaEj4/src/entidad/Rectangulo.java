package entidad;

import interfaz.calculosFormas;

public class Rectangulo implements calculosFormas {
    
    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        Double area;
        area = base * altura;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }
}
