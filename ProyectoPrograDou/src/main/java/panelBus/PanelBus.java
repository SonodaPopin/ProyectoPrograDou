package panelBus;

import javax.swing.*;
import java.awt.*;
import main.*;
import panelPrincipal.*;

public class PanelBus extends JPanel{
	Ventana v;
	Doubus db;
	BotonConfirmarBus bcb;
	BotonCancelarBus bccb;
	Informacion inf;
	BotonPiso1 bp1;
	BotonPiso2 bp2;
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
        inf = new Informacion();
        bcb = new BotonConfirmarBus(this);
        bccb = new BotonCancelarBus(this);
        piso1 = new PanelAsientos(2);
        
        if(pisos == 2) {
        	bp1 = new BotonPiso1();
        	bp2 = new BotonPiso2();
        	this.add(bp1);
        	this.add(bp2);
        }
        
        this.add(db);
        this.add(inf);
        this.add(bcb);
        this.add(bccb);
        this.add(piso1);
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}
