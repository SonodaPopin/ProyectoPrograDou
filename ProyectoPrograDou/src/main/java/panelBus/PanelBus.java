package panelBus;

import javax.swing.*;
import java.awt.*;
import main.*;
import panelPrincipal.*;

public class PanelBus extends JPanel{
	Ventana v;
	Doubus db;
	int pisos;
	PanelAsientos piso1, piso2;
	Pasaje p;
    public PanelBus(Ventana v, Pasaje p) {
    	this.p = p;
    	pisos = p.getPisos();
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        this.v = v;
        
        db = new Doubus();
        piso1 = new PanelAsientos(1);       
        this.add(db);
        this.add(piso1);
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}
