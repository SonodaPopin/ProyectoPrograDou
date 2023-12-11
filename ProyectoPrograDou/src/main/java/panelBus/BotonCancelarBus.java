package panelBus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.Ventana;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import panelPrincipal.PanelPrincipal;

public class BotonCancelarBus extends JPanel implements MouseListener{
	Ventana v;
	Color VerdeOscuro = new Color(0,102,0);
    public BotonCancelarBus(Ventana v){
    	this.v = v;
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
		v.PreviousPanel();
		
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