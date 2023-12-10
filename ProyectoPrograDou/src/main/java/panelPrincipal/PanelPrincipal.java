package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import main.*;

public class PanelPrincipal extends JPanel {
    protected int boton;
    protected int destructor = 0;
	Ventana v;
	BotonIda bi;
	BotonVuelta bv;
	Doubus db;
	
	BotonDestinoIda bdi;
	BotonDestinoVuelta bdv;
	BotonFechaIda bfi;
	BotonFechaVuelta bfv;
	BotonBuscar bb;
	
	PanelTickets pt1, pt2;
	BotonConfirmar bc;
	BotonCancelar bcc;
    public PanelPrincipal(Ventana v) {
        this.setBounds(0,0,1080,720);
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
        
        pt1 = new PanelTickets(1);
        pt2 = new PanelTickets(2);
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
    	if (destructor == 0) {
    		pt1 = new PanelTickets(1);
    		pt2 = new PanelTickets(2);
    		this.add(pt1);
    		this.add(bc);
    		this.add(bcc);
    		destructor++;
    	}
    	else if (destructor == 1){
    		this.remove(pt1);
    		this.add(pt2);
    		destructor++;
    	}
    	else {
    		this.remove(pt2);
    		this.add(pt1);
    		destructor--;
    	}
		v.repaint();
    }
    public void ticketsNo() {
    	this.remove(pt1);
    	this.remove(pt2);
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
    public Pasaje crearPasaje(int a) {
    	if (a == 1) {
    		Pasaje pasaje = new Pasaje(bdi.getDestino(), bdv.getDestino(), pt1, bfi);
    		return pasaje;
    	}
    	else {
    		Pasaje pasaje = new Pasaje(bdv.getDestino(), bdi.getDestino(), pt2, bfv);
    		return pasaje;
    	}
    }
    public void Order66(){
    	v.Parte2(boton);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}