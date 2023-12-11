package panelPrincipal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AñoTest {

    @Test
    void Testañosiguiente() {
        Año año = new Año();
        int actualInicial = año.getActual();

        año.Siguiente();

        assertEquals(actualInicial + 1, año.getActual());
    }
    @Test
    void Testañoanterior() {
        Año año = new Año();
        int actualInicial = año.getActual();

        año.Anterior();

        assertEquals(actualInicial , año.getActual());
    }
}