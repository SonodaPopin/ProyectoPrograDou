package Ciudades;

import java.awt.*;

public class Antofagasta extends Ciudad{
    public Antofagasta(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Antofagasta", 70, 40);
    }
}
