package panelPrincipal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaTest {

    @Test
    void Testsdiasiguiente() {
        Dia dia = new Dia();
        int actualInicial = dia.getActual();

        dia.Siguiente();

        assertEquals(actualInicial + 1, dia.getActual());
    }

    @Test
    void Testdiaanterior() {
        Dia dia = new Dia();
        int actualInicial = dia.getActual();

        dia.Anterior();

        assertEquals(actualInicial - 1, dia.getActual());
    }
}