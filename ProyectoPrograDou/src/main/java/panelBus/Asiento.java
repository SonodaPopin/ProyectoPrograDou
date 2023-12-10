package panelBus;

import javax.swing.*;

import panelPrincipal.PanelTickets;

import java.awt.*;
import java.awt.event.*;

public class Asiento extends JPanel implements MouseListener{
	private PanelAsientos pa;
	private int coorx;
	private int coory;
	private int piso;
	private int precio;
	private String nombre;
    public Asiento(PanelAsientos pb, int a, int b, int piso, int precio, String nombre){
    	this.pa = pa;
    	coorx = a;
    	coory = b;
        this.piso = piso;
        this.precio = precio;
        this.nombre = nombre;
        this.setBounds(a,b,40,60);
        if(precio == 1) {
            this.setBackground(Color.RED);
        }
        else if(precio == 0) {
            this.setBackground(Color.GREEN);
            this.addMouseListener(this);
        }
        else if(precio == 2) {
        	this.setBackground(Color.YELLOW);
            this.addMouseListener(this);
        }
        this.setLayout(null);
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
