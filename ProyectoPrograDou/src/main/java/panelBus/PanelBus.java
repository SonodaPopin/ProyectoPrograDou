package panelBus;

import javax.swing.*;
import java.awt.*;
import main.*;
import panelPrincipal.*;

public class PanelBus extends JPanel{
    private Ventana v;
    private int numpanel;
    private AsientosSelec as;
    private Doubus db;
    private BotonConfirmarBus bcb;
    private BotonCancelarBus bccb;
    private Informacion inf;
    private BotonPiso1 bp1;
    private BotonPiso2 bp2;
	int pisos;
    private PanelAsientos piso1, piso2;
    private Pasaje p;
    public PanelBus(Ventana v, Pasaje p, AsientosSelec as, int numpanel) {
    	this.p = p;
    	pisos = p.getPisos();
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        this.v = v;
        this.as = as;
        this.numpanel = numpanel;
        
        db = new Doubus();
        inf = new Informacion(numpanel);
        bcb = new BotonConfirmarBus(v);
        bccb = new BotonCancelarBus(v);
        piso1 = new PanelAsientos(1, this);
        piso2 = new PanelAsientos(2, this);
        
        if(pisos == 2) {
        	bp1 = new BotonPiso1(this);
        	bp2 = new BotonPiso2(this);
        	this.add(bp1);
        	this.add(bp2);
        }
        
        this.add(db);
        this.add(inf);
        this.add(bcb);
        this.add(bccb);
        this.add(piso1);
        
    }
    public void mostrarPiso1() {
    	this.remove(piso2);
    	this.add(piso1);
    	v.repaint();
    }
    public void mostrarPiso2() {
    	this.remove(piso1);
    	this.add(piso2);
    	v.repaint();
    }
    public void addAsiento(Asiento a) {
    	as.addAsiento(a);
    }
    public void removeAsiento(Asiento a) {
    	as.removeAsiento(a);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}
