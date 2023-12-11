package panelFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  * Clase que representa un panel con una flecha hacia la Izquierda
 */
public class FlechaIzquierdaTicket extends JPanel implements MouseListener{
	PanelReservas pr;
    /**
     * Método constructor que crea el panel
     * @param f - panel sobre el que se muestra la flecha
     */
    public FlechaIzquierdaTicket(PanelReservas pr){
    	this.pr = pr;
        this.setBounds(0,0,100,100);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		int[] xPoints = {75, 25, 75};
		int[] yPoints = {20, 50, 80};
		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(pr.getActual() > 0) {
		pr.cambiarTicket(-1);
		}
		if(pr.getActual() == 0) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(pr.getActual() > 0) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(pr.getActual() > 0) {
		this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}
