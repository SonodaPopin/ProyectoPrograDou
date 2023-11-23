package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonFechaVuelta extends JPanel{
	Dia d;
	Mes m;
	Año a;
    BotonFechaVuelta(){
    	d = new Dia();
    	m = new Mes();
    	a = new Año();
        this.setBounds(740,270,240,200);
        this.setBackground(Color.WHITE);
        this.add(d);
        this.add(m);
        this.add(a);
    }

}

