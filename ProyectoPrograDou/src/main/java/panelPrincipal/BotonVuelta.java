package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonVuelta extends JPanel {
    BotonVuelta(){
        this.setBounds(50,520,300,100);
        this.setBackground(Color.lightGray);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(10, 2, 280, 25);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("Comprar pasaje de ida y vuelta", 15, 20);
    }
}
