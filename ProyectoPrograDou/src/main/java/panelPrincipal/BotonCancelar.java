package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonCancelar extends JPanel implements MouseListener{
	PanelPrincipal pp;
	Color VerdeOscuro = new Color(0,102,0);
    BotonCancelar(PanelPrincipal pp){
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}