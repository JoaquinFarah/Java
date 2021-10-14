package entidad;

import enumeracion.Palos;

public class Baraja {
    private Integer numero;
    private Palos palo;

    public Baraja() {
    }

    public Baraja(Integer numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Baraja{" + " numero | " + numero + ", Palo | " + palo + '}';
    }
    
    

}
