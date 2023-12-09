package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import main.DateActual;

public class BotonBuscar extends JPanel implements MouseListener{
	DateActual da;
	PanelPrincipal pp;
	Color VerdeOscuro = new Color(0,102,0);
    BotonBuscar(PanelPrincipal pp){
    	da = new DateActual();
    	this.pp = pp;
        this.setBounds(430,520,240,100);
        this.setLayout(null);
        this.setBackground(VerdeOscuro);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.WHITE);
		Font font = new Font("Arial", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("Buscar", 65, 60);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (da.comprobarFechaIda(pp.bfi.getFecha()[0], pp.bfi.getFecha()[1], pp.bfi.getFecha()[2]) == 1) {
			if (pp.boton == 1 || (pp.boton == 2 && (da.comprobarFechaVuelta(pp.bfi.getFecha()[0], pp.bfi.getFecha()[1], pp.bfi.getFecha()[2], pp.bfv.getFecha()[0], pp.bfv.getFecha()[1], pp.bfv.getFecha()[2]) == 1))) {
				this.setBorder(BorderFactory.createEmptyBorder());
				pp.botonesNo();
				pp.inicioNo();
				pp.ticketsSi(0);
			} else {
				JOptionPane.showMessageDialog(this, "Fecha de vuelta invalida.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Fecha de Ida invalida.", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
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