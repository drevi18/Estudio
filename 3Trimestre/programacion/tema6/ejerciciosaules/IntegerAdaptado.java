package tema6.ejerciciosaules;

public class IntegerAdaptado implements EsComprable<IntegerAdaptado> {
    private int valor;

    public IntegerAdaptado(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public boolean esMayorQue(IntegerAdaptado otro) {
        return this.valor > otro.valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerAdaptado that = (IntegerAdaptado) obj;
        return valor == that.valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
