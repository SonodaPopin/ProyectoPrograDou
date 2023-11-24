package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import destinos.*;

public class BotonDestinoIda extends JPanel{
	Destino d;
	FlechaDerecha fd;
	FlechaIzquierda fi;
    BotonDestinoIda(){
    	d = new Concepcion();
    	fd = new FlechaDerecha();
    	fi = new FlechaIzquierda();
        this.setBounds(430,50,550,60);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.add(d);
        this.add(fd);
        this.add(fi);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Partida", 35, 40);
    }
}
