package panelPrincipal;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
	BotonIda bi;
	BotonVuelta bv;
	Doubus db;
	
	BotonDestinoIda bdi;
	BotonDestinoVuelta bdv;
	BotonFechaIda bfi;
	BotonFechaVuelta bfv;
	BotonBuscar bb;
    public PanelPrincipal() {
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setBackground(Color.DARK_GRAY);
        
        bi = new BotonIda();
        bv = new BotonVuelta();
        db = new Doubus();
        
        bdi = new BotonDestinoIda();
        bdv = new BotonDestinoVuelta();
        bfi = new BotonFechaIda();
        bfv = new BotonFechaVuelta();
        bb = new BotonBuscar();
        
        this.add(bi);
        this.add(bv);
        this.add(db);
        botonesSi();
        
    }
    public void botonesSi() {
        this.add(bdi);
        this.add(bdv);
        this.add(bfi);
        this.add(bfv); 
        this.add(bb);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}