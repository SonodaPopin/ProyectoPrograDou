package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlechaAbajo extends JPanel implements MouseListener{
	Fechas f;
    public FlechaAbajo(Fechas f){
    	this.f = f;
        this.setBounds(0,110,80,20);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		int[] xPoints = {20, 40, 60};
		int[] yPoints = {5, 15, 5};
		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(f.limit != -1) {
			f.Anterior();
		}
		if(f.limit == -1) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(f.limit != -1) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(f.limit != -1) {
		this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}