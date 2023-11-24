package Ciudades;

import java.awt.*;

public class Valparaíso extends Ciudad{
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
