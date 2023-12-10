package panelBus;

import javax.swing.*;
import java.awt.*;
import main.*;
import panelPrincipal.*;

public class PanelBus extends JPanel{
	Ventana v;
	Doubus db;
    public PanelBus(Ventana v) {
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        this.v = v;
        
        db = new Doubus();
        
        this.add(db);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}
