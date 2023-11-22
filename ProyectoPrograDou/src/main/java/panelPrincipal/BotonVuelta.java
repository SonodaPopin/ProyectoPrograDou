package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonVuelta extends JPanel {
    BotonVuelta(){
        this.setBounds(50,520,300,100);
        this.setBackground(Color.gray);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 300, 28);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("Comprar pasaje de ida y vuelta", 15, 20);

        g.setColor(Color.RED);
        g.fillRect(20, 40, 100, 35);
        g.setColor(Color.BLACK);
        g.drawRect(20, 40, 100, 35);

        g.setColor(Color.CYAN);
        g.fillRect(25, 45, 20, 15);
        g.fillRect(50, 45, 20, 15);
        g.fillRect(75, 45, 20, 15);
        g.fillRect(100, 45, 20, 15);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(30, 65, 20, 20);
        g.fillOval(90, 65, 20, 20);

        g.setColor(Color.BLUE);
        int[] xPoint = {180, 200, 180};
        int[] yPoint = {38, 48, 58};
        g.fillPolygon(xPoint, yPoint, 3);
        g.fillRect(160, 45, 20, 5);

        int[] xPoints = {180, 160, 180};
        int[] yPoints = {70, 80, 90};
        g.fillPolygon(xPoints, yPoints, 3);
        g.fillRect(180, 78, 20, 5);

        g.setColor(Color.YELLOW);
        g.fillRect(220, 45, 20, 15);

        g.setColor(Color.darkGray);
        g.fillRect(220, 45, 5, 30);
    }
}
