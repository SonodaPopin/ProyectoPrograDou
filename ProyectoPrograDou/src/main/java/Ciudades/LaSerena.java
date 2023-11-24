package Ciudades;

import java.awt.*;

public class LaSerena extends Ciudad{
    public LaSerena(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("La Serena", 85, 40);
    }
}
