package panelPrincipal;

import javax.swing.*;
import java.awt.*;

import Ciudades.*;

public class BotonDestinoVuelta extends BotonDestino{
    BotonDestinoVuelta(){
    	actual = 10;
    	d = EnumCiudades.getCiudad(actual);
    	fd = new FlechaDerecha(this);
    	fi = new FlechaIzquierda(this);
        this.setBounds(430,150,550,60);
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
        g.drawString("Destino", 30, 40);
    }
}
