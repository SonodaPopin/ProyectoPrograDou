package panelPrincipal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesTest {

    @Test
    void Testmessiguiente() {
        Mes mes = new Mes();
        int actualInicial = mes.getActual();

        mes.Siguiente();

        assertEquals(actualInicial + 1, mes.getActual());
    }

    @Test
    void Testmesanterior() {
        Mes mes = new Mes();
        int actualInicial = mes.getActual();

        mes.Anterior();

        assertEquals(actualInicial - 1, mes.getActual());

    }
}