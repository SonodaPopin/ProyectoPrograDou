package numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numero2 extends Numero{
    public Numero2(){
    	super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("2", 25, 60);
    }
}