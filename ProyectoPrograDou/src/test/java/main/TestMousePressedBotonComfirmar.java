package main;

import main.Ventana;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import panelPrincipal.BotonConfirmar;
import panelPrincipal.PanelPrincipal;

import static org.junit.jupiter.api.Assertions.fail;

public class TestMousePressedBotonComfirmar {
    @Test
    @DisplayName("Test BotonComfirmar")
    public void testMousePressed() {
        BotonConfirmar instancia = new BotonConfirmar(new PanelPrincipal(new Ventana()));
        try {
            instancia.mousePressed(null);
        } catch (Exception ex) {
            fail("Se lanzó una excepción inesperada: " + ex.getMessage());
        }
    }
}
