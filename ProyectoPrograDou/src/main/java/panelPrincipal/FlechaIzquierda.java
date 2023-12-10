package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel con una flecha hacia la izquierda
 */
public class FlechaIzquierda extends JPanel implements MouseListener{
    BotonDestino bd;
    /**
     * Método constructor que crea el panel
     * @param f - panel sobre el que se muestra la flecha
     */
	public FlechaIzquierda(BotonDestino bd){
		this.bd = bd;
        this.setBounds(490,0,60,60);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		int[] xPoints = {15, 45,15};
		int[] yPoints = {15, 30, 45};
		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(bd.getActual() < 14) {
		bd.Siguiente();
		}
		if(bd.getActual() == 14) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(bd.getActual() < 14) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(bd.getActual() < 14) {
		this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}