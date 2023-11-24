package panelPrincipal;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
	int boton;
	JFrame v;
	BotonIda bi;
	BotonVuelta bv;
	Doubus db;
	
	BotonDestinoIda bdi;
	BotonDestinoVuelta bdv;
	BotonFechaIda bfi;
	BotonFechaVuelta bfv;
	BotonBuscar bb;
	
	PanelTickets pt;
	BotonConfirmar bc;
	BotonCancelar bcc;
    public PanelPrincipal(JFrame v) {
        this.setLayout(null);
        this.setBounds(0,0,1080,720);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.v = v;
        
        bi = new BotonIda(this);
        bv = new BotonVuelta(this);
        db = new Doubus();
        
        bdi = new BotonDestinoIda();
        bdv = new BotonDestinoVuelta();
        bfi = new BotonFechaIda();
        bfv = new BotonFechaVuelta();
        bb = new BotonBuscar(this);
        
        pt = new PanelTickets();
        bc = new BotonConfirmar(this);
        bcc = new BotonCancelar(this);
        
        this.add(db); 
        inicioSi();
    }
    public void botonesSi() {
        if (boton==1) {
            this.add(bdi);
            this.add(bdv);
            this.add(bfi);
            this.add(bb);
            this.remove(bfv); 
            bi.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
    		bv.setBorder(BorderFactory.createEmptyBorder());
        }
        if (boton==2) {
            this.add(bdi);
            this.add(bdv);
            this.add(bfi);
            this.add(bb);
            this.add(bfv); 
            bv.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
    		bi.setBorder(BorderFactory.createEmptyBorder());
        }
        v.repaint();
    }
    public void botonesNo() {
        this.remove(bdi);
        this.remove(bdv);
        this.remove(bfi);
        this.remove(bb);
        this.remove(bfv); 
		bi.setBorder(BorderFactory.createEmptyBorder());
		bv.setBorder(BorderFactory.createEmptyBorder());
        v.repaint();
    }
    public void ticketsSi() {
    	this.add(pt);
        this.add(bc);
        this.add(bcc);
        v.repaint();
    }
    public void ticketsNo() {
    	this.remove(pt);
        this.remove(bc);
        this.remove(bcc);
        v.repaint();
    }
    public void inicioSi() {
        this.add(bi);
        this.add(bv);
    }
    public void inicioNo() {
        this.remove(bi);
        this.remove(bv);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}