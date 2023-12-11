package Ciudades;

import java.awt.*;
/**
 * Clase que representa la ciudad Iquique
 */
public class Iquique extends Ciudad{
    /**
     * Método constructor del panel
     */
    public Iquique(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Iquique", 100, 40);
    }
}
