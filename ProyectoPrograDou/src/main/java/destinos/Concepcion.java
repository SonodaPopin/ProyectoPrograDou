package destinos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Concepcion extends Destino{
    public Concepcion(){
    	super();
        this.setBackground(Color.BLUE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Concepción", 70, 40);
    }
}