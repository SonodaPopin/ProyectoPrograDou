package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Arica
 */
public class Arica extends Ciudad{
    /**
     * Método constructor del panel
     */
    public Arica(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Arica", 110, 40);
    }
}
