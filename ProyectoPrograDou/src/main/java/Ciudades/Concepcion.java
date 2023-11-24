package Ciudades;

import java.awt.*;

public class Concepcion extends Ciudad {
    public Concepcion(){
    	super();
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