package Ciudades;

import java.awt.*;

public class Temuco extends Ciudad{
    public Temuco(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Temuco", 90, 40);
    }
}
