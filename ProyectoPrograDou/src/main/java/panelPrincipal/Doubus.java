package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel con el logo de Doubus
 */
public class Doubus extends JPanel {
    /**
     * Método constructor del panel
     */
    public Doubus(){
        this.setBounds(50,50,300,300);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("doubuslogo.jpg");

        g.drawImage(bus.getImage(), 0, 0, 300, 300, null);
    }
}
