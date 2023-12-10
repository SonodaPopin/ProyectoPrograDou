package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un botón para volver atrás
 */
public class BotonCancelar extends JPanel implements MouseListener{
	PanelPrincipal pp;
	Color VerdeOscuro = new Color(0,102,0);
    /**
     * Método constructor del panel
     * @param pp - panel sobre el que se muestra
     */
    public BotonCancelar(PanelPrincipal pp){
    	this.pp = pp;
        this.setBounds(50,520,300,100);
        this.setBackground(VerdeOscuro);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.WHITE);
		Font font = new Font("Arial", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("Cancelar", 85, 60);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(pp.destructor == 1) {
			this.setBorder(BorderFactory.createEmptyBorder());
			pp.ticketsNo();
			pp.inicioSi();
			pp.botonesSi();
			pp.destructor--;
		}
		else{
			pp.ticketsSi();
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