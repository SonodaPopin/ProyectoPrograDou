package numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Numero extends JPanel{
    public Numero(){
        this.setBounds(0,20,80,90);
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 80,1);
        g.fillRect(0, 0, 1,90);
        g.fillRect(79, 0, 1,90);
        g.fillRect(0, 89, 80,1);
    }
}