package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonIda extends JPanel {
    BotonIda(){
        this.setBounds(50,400,300,100);
        this.setBackground(Color.LIGHT_GRAY);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(30, 2, 225, 25);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("Comprar pasaje solo Ida", 35, 20);
    }
}
