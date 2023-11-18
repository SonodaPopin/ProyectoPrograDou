package panelPrincipal;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
	BotonIda bi;
	BotonVuelta bv;
	Doubus db;
	Publicidad p;
	
	BotonDestinoIda bdi;
	BotonDestinoVuelta bdv;
	BotonFechaIda bfi;
	BotonFechaVuelta bfv;
    public PanelPrincipal() {
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setBackground(Color.DARK_GRAY);
        
        bi = new BotonIda();
        bv = new BotonVuelta();
        db = new Doubus();
        p = new Publicidad();
        
        bdi = new BotonDestinoIda();
        bdv = new BotonDestinoVuelta();
        bfi = new BotonFechaIda();
        bfv = new BotonFechaVuelta();
        
        this.add(bi);
        this.add(bv);
        this.add(db);
        this.add(p);
        
        //this.add(bdi);
        //this.add(bdv);
        //this.add(bfi);
        //this.add(bfv); 
    }
}