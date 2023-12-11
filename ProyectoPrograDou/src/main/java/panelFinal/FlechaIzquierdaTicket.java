package panelFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel con una flecha hacia la izquierda
 */
public class FlechaIzquierdaTicket extends JPanel implements MouseListener{
    private PanelReservas pr;
    private int cantidad;
    /**
     * Método constructor que crea el panel
     * @param f - panel sobre el que se muestra la flecha
     */
	public FlechaIzquierdaTicket(PanelReservas pr, int cantidad){
		this.pr = pr;
		this.cantidad = cantidad;
        this.setBounds(450,0,100,100);
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
