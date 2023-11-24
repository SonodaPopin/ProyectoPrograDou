package Ciudades;

import java.awt.*;

public class Talca extends Ciudad{
    public Talca(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Talca", 110, 40);
    }
}
