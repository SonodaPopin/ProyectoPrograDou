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
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.add(d);
        this.add(m);
        this.add(a);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Fecha Ida", 60, 45);
    }
}
