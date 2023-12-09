package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class BotonFecha extends JPanel{
	Dia d;
	Mes m;
	Año a;
    public int[] getFecha() {
    	int[] fecha = {d.getActual(),m.getActual(),a.getActual()};
    	return fecha;
    }
}