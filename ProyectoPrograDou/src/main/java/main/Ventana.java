package main;

import javax.swing.*;

import panelPrincipal.PanelPrincipal;
import panelBus.PanelBus;
import panelFinal.PanelFinal;

/**
 * Clase que representa la interfaz del programa
 */
public class Ventana extends JFrame{
	private int boton;
	private int panelactual;
	PanelPrincipal pp;
	PanelBus pb1, pb2;
	PanelFinal pf;
	Pasaje pa1;
	Pasaje pa2;
	AsientosSelec as;
    /**
     * Método constructor de la ventana
     */
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
    /**
     * Método que pasa de panelPrincipal a panelBus
     * @param boton - número de pasajes
     */
    public void Parte2(int boton) {
    	as = new AsientosSelec();
    	this.boton = boton;
    	if (boton == 1) {
    		pa1 = pp.crearPasaje(1);
            pb1 = new PanelBus(this, pa1, as, 1);
    	}
    	else {
    		pa1 = pp.crearPasaje(1);
    		pa2 = pp.crearPasaje(2);
            pb1 = new PanelBus(this, pa1, as, 1);
            pb2 = new PanelBus(this, pa2, as, 2);
    	}  
    	this.remove(pp);
    	this.add(pb1);
    	panelactual = 1;
    	this.repaint();
    }
    /**
     * Método para pasar al siguiente panel
     */
    public void NextPanel() {
    	if(boton == 2 && panelactual == 1) {
    		this.remove(pb1);
    		this.add(pb2);
    		panelactual++;
    	}
    	else if(boton == 2 && panelactual == 2){
    		pf = new PanelFinal(this, as);
    		this.remove(pb1);
    		this.remove(pb2);
    		this.add(pf);
    		panelactual++;
    	}
    	else if (boton == 1 && panelactual == 1){
    		pf = new PanelFinal(this, as);
    		this.remove(pb1);
    		this.add(pf);
    		panelactual++;
    	}
    	else {
    		pf.Nukear();
    	}
    	this.repaint();
    }
    /**
     * Método para volver al panel anterior
     */
    public void PreviousPanel() {
    	if(boton == 2 && panelactual == 2) {
    		this.remove(pb2);
    		this.add(pb1);
    		panelactual--;
    	}
    	else if(boton == 1 && panelactual == 2){
    		this.remove(pf);
    		this.add(pb1);
       		panelactual--;
    	}
    	else {
    		this.remove(pb1);
    		this.add(pp);
    	}
    	this.repaint();
    }
}
