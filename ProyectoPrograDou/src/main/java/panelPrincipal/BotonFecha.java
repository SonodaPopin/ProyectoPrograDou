package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel para elegir la fecha del viaje
 */
public abstract class BotonFecha extends JPanel{
	protected Dia d;
	protected Mes m;
	protected Año a;
    /**
     * Método para obtener la fecha elegida actualmente
     * @return - un array que contiene la fecha en orden dia-mes-año
     */
    public int[] getFecha() {
    	int[] fecha = {d.getActual(),m.getActual(),a.getActual()};
    	return fecha;
    }
}