package numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numero22 extends Numero{
    public Numero22(){
    	super();
        this.setBackground(Color.PINK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("22", 15, 60);
    }
}