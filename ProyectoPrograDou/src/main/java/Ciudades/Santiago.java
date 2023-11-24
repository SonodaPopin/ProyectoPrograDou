package Ciudades;

import java.awt.*;

public class Santiago extends Ciudad {
    public Santiago(){
    	super();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Santiago", 95, 40);
    }
}