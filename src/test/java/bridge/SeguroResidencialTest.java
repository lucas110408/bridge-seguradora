package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguroResidencialTest {

    @Test
    void deveRetornarPremioSeguroResidencialComRiscoBaixo() {
        PerfilRisco perfilRisco = new RiscoBaixo();
        SeguroResidencial seguroResidencial = new SeguroResidencial(800.0f);
        seguroResidencial.setPerfilRisco(perfilRisco);
        assertEquals(800.0f, seguroResidencial.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroResidencialComRiscoMedio() {
        PerfilRisco perfilRisco = new RiscoMedio();
        SeguroResidencial seguroResidencial = new SeguroResidencial(800.0f);
        seguroResidencial.setPerfilRisco(perfilRisco);
        assertEquals(800.0f, seguroResidencial.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroResidencialComRiscoAlto() {
        PerfilRisco perfilRisco = new RiscoAlto();
        SeguroResidencial seguroResidencial = new SeguroResidencial(800.0f);
        seguroResidencial.setPerfilRisco(perfilRisco);
        assertEquals(800.0f, seguroResidencial.calcularPremio(), 0.01f);
    }

}
