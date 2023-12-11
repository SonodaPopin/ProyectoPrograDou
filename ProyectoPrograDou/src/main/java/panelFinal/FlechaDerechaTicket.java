package panelFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  * Clase que representa un panel con una flecha hacia la derecha
 */
public class FlechaDerechaTicket extends JPanel implements MouseListener{
	PanelReservas pr;
    /**
     * Método constructor que crea el panel
     * @param f - panel sobre el que se muestra la flecha
     */
    public FlechaDerechaTicket(PanelReservas pr){
    	this.pr = pr;
        this.setBounds(0,0,100,100);
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
