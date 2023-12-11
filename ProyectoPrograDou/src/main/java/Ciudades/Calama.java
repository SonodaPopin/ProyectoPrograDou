package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Calama
 */
public class Calama extends Ciudad{
    /**
     * Método constructor del panel
     */
    public Calama(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Calama", 100, 40);
    }
}
