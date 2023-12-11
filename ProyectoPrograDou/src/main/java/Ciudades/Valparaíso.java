package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Valparaíso
 */
public class Valparaíso extends Ciudad{
    /**
     * Método constructor del panel
     */
    public Valparaíso(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Valparaíso", 85, 40);
    }
}
