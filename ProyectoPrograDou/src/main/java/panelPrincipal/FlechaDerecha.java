package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlechaDerecha extends JPanel implements MouseListener{
	BotonDestino bd;
    public FlechaDerecha(BotonDestino bd){
    	this.bd = bd;
        this.setBounds(150,0,60,60);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		int[] xPoints = {45, 15, 45};
		int[] yPoints = {15, 30, 45};
		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(bd.getActual() > 0) {
		bd.Anterior();
		}
		if(bd.getActual() == 0) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(bd.getActual() > 0) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(bd.getActual() > 0) {
		this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}
