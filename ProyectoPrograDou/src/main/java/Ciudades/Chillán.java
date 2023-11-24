package Ciudades;

import java.awt.*;

public class Chillán extends Ciudad{
    public Chillán(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Chillán", 100, 40);
    }
}
