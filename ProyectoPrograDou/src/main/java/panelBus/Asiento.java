package panelBus;

import javax.swing.*;

import panelPrincipal.PanelTickets;

import java.awt.*;
import java.awt.event.*;

public class Asiento extends JPanel implements MouseListener{
	PanelAsientos pa;
	int piso;
	int precio;
	String nombre;
    public Asiento(PanelAsientos pb, int a, int b, int piso, int precio, String nombre){
    	this.pa = pa;
        this.piso = piso;
        this.precio = precio;
        this.nombre = nombre;
        this.setBounds(a,b,40,60);
        if(precio == 1) {
            this.setBackground(Color.GREEN);
        }
        else if(precio == 2) {
        	this.setBackground(Color.YELLOW);
        }
        this.setLayout(null);
        this.addMouseListener(this);
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
