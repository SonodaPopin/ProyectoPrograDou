package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateActualTest {

    @Test
    @DisplayName("Test comprobarFechaIda")
    void TestcomprobarFechaIda() {
        DateActual dateActual = new DateActual();

        int resultado1 = dateActual.comprobarFechaIda(dateActual.getDia() + 1, dateActual.getMes(), dateActual.getAño());
        assertEquals(1, resultado1);

        int resultado2 = dateActual.comprobarFechaIda(dateActual.getDia() - 1, dateActual.getMes(), dateActual.getAño());
        assertEquals(-1, resultado2);
    }
    @Test
    @DisplayName("Test comprobarFechaVuelta")
    void TestcomprobarFechaVuelta() {
        DateActual dateActual = new DateActual();

        int resultado1 = dateActual.comprobarFechaVuelta(dateActual.getDia(), dateActual.getMes(), dateActual.getAño(),
                dateActual.getDia() + 1, dateActual.getMes(), dateActual.getAño());
        assertEquals(1, resultado1);

        int resultado2 = dateActual.comprobarFechaVuelta(dateActual.getDia() + 1, dateActual.getMes(), dateActual.getAño(),
                dateActual.getDia(), dateActual.getMes(), dateActual.getAño());
        assertEquals(-1, resultado2);
    }
}