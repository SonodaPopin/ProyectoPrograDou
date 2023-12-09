package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonConfirmar extends JPanel implements MouseListener{
	PanelPrincipal pp;
	Color VerdeOscuro = new Color(0,102,0);
    BotonConfirmar(PanelPrincipal pp){
    	this.pp = pp;
        this.setBounds(50,400,300,100);
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
		g.drawString("Confirmar", 75, 60);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(pp.boton == 2 && pp.destructor == 1) {
			pp.ticketsSi();
		}
		else if(pp.boton == 1){
			pp.crearPasaje(1);
			pp.ticketsNo();
			this.setBorder(BorderFactory.createEmptyBorder());
		}
		else if(pp.boton == 2) {
			pp.crearPasaje(1);
			pp.crearPasaje(2);
			pp.ticketsNo();
			this.setBorder(BorderFactory.createEmptyBorder());
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