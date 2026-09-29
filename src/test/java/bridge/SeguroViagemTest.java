package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguroViagemTest {

    @Test
    void deveRetornarPremioSeguroViagemComRiscoBaixo() {
        PerfilRisco perfilRisco = new RiscoBaixo();
        SeguroViagem seguroViagem = new SeguroViagem(50.0f);
        seguroViagem.setPerfilRisco(perfilRisco);
        seguroViagem.setNumeroDias(4);
        assertEquals(200.0f, seguroViagem.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroViagemComRiscoMedio() {
        PerfilRisco perfilRisco = new RiscoMedio();
        SeguroViagem seguroViagem = new SeguroViagem(50.0f);
        seguroViagem.setPerfilRisco(perfilRisco);
        seguroViagem.setNumeroDias(4);
        assertEquals(230.0f, seguroViagem.calcularPremio(), 0.01f);
    }

    @Test
    void deveRetornarPremioSeguroViagemComRiscoAlto() {
        PerfilRisco perfilRisco = new RiscoAlto();
        SeguroViagem seguroViagem = new SeguroViagem(50.0f);
        seguroViagem.setPerfilRisco(perfilRisco);
        seguroViagem.setNumeroDias(4);
        assertEquals(260.0f, seguroViagem.calcularPremio(), 0.01f);
    }

}
