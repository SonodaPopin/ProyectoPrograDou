package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonConfirmar extends JPanel implements MouseListener{
	PanelPrincipal pp;
	Color VerdeOscuro = new Color(0,102,0);
    public BotonConfirmar(PanelPrincipal pp){
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
		try {
			if (pp.boton == 2 && pp.destructor == 1) {
				pp.ticketsSi();
			} else {
				pp.Order66();
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Debe eligir un pasaje de Ida y/o Vuelta para continuar", "Error", JOptionPane.ERROR_MESSAGE);
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