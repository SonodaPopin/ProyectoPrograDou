package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonFechaIda extends JPanel{
	Dia d;
	Mes m;
	Año a;
    BotonFechaIda(){
    	d = new Dia();
    	m = new Mes();
    	a = new Año();
        this.setBounds(430,270,240,200);
        this.setBackground(Color.WHITE);
        this.add(d);
        this.add(m);
        this.add(a);
    }

}
