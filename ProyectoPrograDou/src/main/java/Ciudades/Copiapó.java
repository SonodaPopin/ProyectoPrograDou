package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Copiapó
 */
public class Copiapó extends Ciudad{
    /**
     * Método constructor del panel
     */
    public Copiapó(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Copiapó", 90, 40);
    }
}
