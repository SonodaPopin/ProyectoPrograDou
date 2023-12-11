package panelFinal;

import java.awt.*;

import javax.swing.*;

/**
 * Clase que representa un panel de agradecimiento
 */
public class PanelGracias extends JPanel{
	/**
	 * Método constructor del panel
	 */
	public PanelGracias(){
		this.setBounds(430,115,550,150);
        this.setBackground(new Color(100, 100, 100, 200));
		this.setLayout(null);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 25);
		g.setFont(font);
		g.drawString("Su reserva a sido realizada con exito", 40, 40);
		g.drawString("Gracias por preferir DouBus", 40, 80);
		g.drawString("Buen viaje!!!", 40, 120);
	}
}