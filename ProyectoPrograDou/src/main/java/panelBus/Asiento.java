package panelBus;

import javax.swing.*;

import panelPrincipal.PanelTickets;

import java.awt.*;
import java.awt.event.*;

public class Asiento extends JPanel implements MouseListener{
	PanelAsientos pa;
	int piso;
	int precio;
    public Asiento(PanelAsientos pb, int a, int b, int piso, int precio){
    	this.pa = pa;
        this.piso = piso;
        this.precio = precio;
        this.setBounds(a,b,40,60);
        this.setBackground(Color.RED);
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
