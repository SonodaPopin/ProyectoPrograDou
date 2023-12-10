package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import main.*;

/**
 * Clase que representa el panel donde se muestran los datos y botones para elegir un pasaje de bus
 */
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
    /**
     * Método constructor del panel
     * @param v - ventana sobre la que se crea el panel
     */
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
    /**
     * Método que añade más botones sobre el panel
     */
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
    /**
     * Método que quita varios botones de sobre el panel
     */
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
    /**
     * Método para mostrar un PanelTickets sobre el panel
     */
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
    /**
     * Método para esconder el PanelTickets
     */
    public void ticketsNo() {
    	this.remove(pt1);
    	this.remove(pt2);
        this.remove(bc);
        this.remove(bcc);
        v.repaint();
    }
    /**
     * Método que añade los botones iniciales al panel
     */
    public void inicioSi() {
        this.add(bi);
        this.add(bv);
    }
    /**
     * Método que quita los botones iniciales del panel
     */
    public void inicioNo() {
        this.remove(bi);
        this.remove(bv);
    }
    /**
     * Método que crea un pasaje con los datos ingresados en el panel
     * @param a - numero 1 o 2 que decide si crear el pasaje de ida o de vuelta
     * @return - el pasaje creado
     */
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
    /**
     * Método que llama a otro método en ventana
     */
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