package bridge;

public class SeguroViagem extends Seguro {

    private int numeroDias;

    public SeguroViagem(float premioBase) {
        super(premioBase);
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public float calcularPremio() {
        return this.premioBase * this.numeroDias * (1 + this.perfilRisco.percentualAgravo());
    }
}
