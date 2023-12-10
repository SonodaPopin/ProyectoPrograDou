package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonFechaVuelta extends BotonFecha{
    public BotonFechaVuelta(){
    	d = new Dia();
    	m = new Mes();
    	a = new Año();
        this.setBounds(740,270,240,200);
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
        g.drawString("Fecha Vuelta", 45, 45);
    }
}