package enumeracion;

public enum Palos {
    ESPADA(1, "Espada"), BASTO(2, "Basto"), ORO(3, "Oro"), COPA(4, "Copa");
    
    private Integer codigo;
    private String valor;

    private Palos(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
}
