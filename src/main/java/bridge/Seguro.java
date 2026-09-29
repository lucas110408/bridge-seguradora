package bridge;

public abstract class Seguro {

    protected PerfilRisco perfilRisco;

    protected float premioBase;

    public Seguro(float premioBase) {
        this.premioBase = premioBase;
    }

    public void setPerfilRisco(PerfilRisco perfilRisco) {
        this.perfilRisco = perfilRisco;
    }

    public void setPremioBase(float premioBase) {
        this.premioBase = premioBase;
    }

    public abstract float calcularPremio();
}
