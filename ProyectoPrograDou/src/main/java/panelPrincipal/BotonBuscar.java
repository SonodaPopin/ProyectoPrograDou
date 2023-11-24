package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonBuscar extends JPanel implements MouseListener{
Color VerdeOscuro = new Color(0,102,0);
    BotonBuscar(){
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