package panelPrincipal;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
	BotonIda bi = new BotonIda();
	BotonVuelta bv = new BotonVuelta();
	Doubus db = new Doubus();
	Publicidad p = new Publicidad();
    public PanelPrincipal() {
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setBackground(Color.DARK_GRAY);
        
        bi = new BotonIda();
        bv = new BotonVuelta();
        db = new Doubus();
        p = new Publicidad();
        
        this.add(bi);
        this.add(bv);
        this.add(db);
        this.add(p);
    }
}