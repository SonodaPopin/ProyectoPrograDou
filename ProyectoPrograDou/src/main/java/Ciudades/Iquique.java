package Ciudades;

import java.awt.*;

public class Iquique extends Ciudad{
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
