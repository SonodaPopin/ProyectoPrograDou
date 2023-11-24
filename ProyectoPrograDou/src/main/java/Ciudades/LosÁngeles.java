package Ciudades;

import java.awt.*;

public class LosÁngeles extends Ciudad{
    public LosÁngeles(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("Los Ángeles", 70, 40);
    }
}
