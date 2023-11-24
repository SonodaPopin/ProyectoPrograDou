package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlechaDerecha extends JPanel implements MouseListener{
    FlechaDerecha(){
        this.setBounds(150,0,60,60);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		int[] xPoints = {40, 20,40};
		int[] yPoints = {20, 30, 40};
		g.fillPolygon(xPoints, yPoints, 3);
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
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		this.setBorder(BorderFactory.createEmptyBorder());
	}
}
