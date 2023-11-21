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
        g.fillRect(0, 0, 300, 28);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("Comprar pasaje solo Ida", 35, 20);

        g.setColor(Color.RED);
        g.fillRect(20, 40, 100, 35);
        g.setColor(Color.BLACK);
        g.drawRect(20, 40, 100, 35);

        g.setColor(Color.CYAN);
        g.fillRect(25, 45, 20, 15);
        g.fillRect(50, 45, 20, 15);
        g.fillRect(75, 45, 20, 15);
        g.fillRect(100, 45, 20, 15);

        g.setColor(Color.GRAY);
        g.fillOval(30, 65, 20, 20);
        g.fillOval(90, 65, 20, 20);

        g.setColor(Color.BLUE);
        int[] xPoints = {180, 200, 180};
        int[] yPoints = {50, 60, 70};
        g.fillPolygon(xPoints, yPoints, 3);
        g.fillRect(160, 58, 20, 5);

        g.setColor(Color.YELLOW);
        g.fillRect(220, 45, 20, 15);

        g.setColor(Color.gray);
        g.fillRect(220, 45, 5, 30);
    }
}
