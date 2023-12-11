package panelFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel con una flecha hacia la derecha
 */
public class FlechaDerechaTicket extends JPanel implements MouseListener{
    private PanelReservas pr;
    private int cantidad;
    /**
     * Método constructor que crea el panel
     * @param pr - panel sobre el que se muestra la flecha
     */
	public FlechaDerechaTicket(PanelReservas pr, int cantidad){
		this.pr = pr;
		this.cantidad = cantidad;
        this.setBounds(450,0,100,100);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		int[] xPoints = {25, 75, 25};
		int[] yPoints = {20, 50, 80};
		g.fillPolygon(xPoints, yPoints, 3);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(pr.getActual() < cantidad-1) {
		pr.cambiarTicket(1);
		}
		if(pr.getActual() == cantidad-1) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(pr.getActual() < cantidad-1) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(pr.getActual() < cantidad-1) {
		this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}
