package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad PuertoMontt
 */
public class PuertoMontt extends Ciudad{
    /**
     * Método constructor del panel
     */
    public PuertoMontt(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Puerto Montt", 65, 40);
    }
}
