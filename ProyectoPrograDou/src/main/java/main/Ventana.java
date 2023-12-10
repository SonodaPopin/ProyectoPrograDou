package main;

import javax.swing.*;

import panelPrincipal.PanelPrincipal;
import panelBus.PanelBus;

public class Ventana extends JFrame{
	private int boton;
	PanelPrincipal pp;
	PanelBus pb1;
	PanelBus pb2;
	Pasaje pa1;
	Pasaje pa2;
    public Ventana() {
        super();

        this.setLayout(null);
        this.setTitle("BusesDou");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        
        pp = new PanelPrincipal(this);
        this.add(pp);

        ImageIcon image = new ImageIcon("doubuslogodou.jpg");
        this.setIconImage(image.getImage());
    }
    public void Parte2(int boton) {
    	this.boton = boton;
    	if (boton == 1) {
    		pa1 = pp.crearPasaje(1);
            pb1 = new PanelBus(this, pa1);
    	}
    	else {
    		pa1 = pp.crearPasaje(1);
    		pa2 = pp.crearPasaje(2);
            pb1 = new PanelBus(this, pa1);
            pb2 = new PanelBus(this, pa2);
    	}  
    	this.remove(pp);
    	this.add(pb1);
    	this.repaint();
    }
}
