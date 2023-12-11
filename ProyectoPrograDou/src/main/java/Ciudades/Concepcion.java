package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Concepción
 */
public class Concepcion extends Ciudad {
    /**
     * Método constructor del panel
     */
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