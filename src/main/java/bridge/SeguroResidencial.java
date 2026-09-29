package bridge;

public class SeguroResidencial extends Seguro {

    public SeguroResidencial(float premioBase) {
        super(premioBase);
    }

    public float calcularPremio() {
        return this.premioBase;
    }
}
