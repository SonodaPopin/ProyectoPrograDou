package panelBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Clase que representa un boton para volver seleccionar el segundo piso
 */
public class BotonPiso2 extends JPanel implements MouseListener{
	PanelBus pb;
	/**
	 * Método para crear el botón
	 * @param pb - panel donde se muestra el botón
	 */
	public BotonPiso2(PanelBus pb){
		this.pb = pb;
		this.setBounds(800,520,220,100);
		this.setBackground(Color.darkGray);
		this.setLayout(null);
		this.addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("Piso 2", 60, 60);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pb.mostrarPiso2();
		
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