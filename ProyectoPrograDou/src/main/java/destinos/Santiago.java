package destinos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Santiago extends Destino{
    public Santiago(){
    	super();
        this.setBackground(Color.BLACK);
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