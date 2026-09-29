package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguroAutoTest {

    @Test
    void deveRetornarPremioSeguroAutoComRiscoBaixo() {
        PerfilRisco perfilRisco = new RiscoBaixo();
        SeguroAuto seguroAuto = new SeguroAuto(1000.0f);
        seguroAuto.setPerfilRisco(perfilRisco);
        assertEquals(1000.0f, seguroAuto.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroAutoComRiscoMedio() {
        PerfilRisco perfilRisco = new RiscoMedio();
        SeguroAuto seguroAuto = new SeguroAuto(1000.0f);
        seguroAuto.setPerfilRisco(perfilRisco);
        assertEquals(1150.0f, seguroAuto.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroAutoComRiscoAlto() {
        PerfilRisco perfilRisco = new RiscoAlto();
        SeguroAuto seguroAuto = new SeguroAuto(1000.0f);
        seguroAuto.setPerfilRisco(perfilRisco);
        assertEquals(1300.0f, seguroAuto.calcularPremio(), 0.01f);
    }

}
