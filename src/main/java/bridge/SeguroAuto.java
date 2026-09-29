package bridge;

public class SeguroAuto extends Seguro {

    public SeguroAuto(float premioBase) {
        super(premioBase);
    }

    public float calcularPremio() {
        return this.premioBase * (1 + this.perfilRisco.percentualAgravo());
    }
}
