package Ciudades;

import java.awt.*;

public class Valdivia extends Ciudad{
    public Valdivia(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Valdivia", 100, 40);
    }
}
