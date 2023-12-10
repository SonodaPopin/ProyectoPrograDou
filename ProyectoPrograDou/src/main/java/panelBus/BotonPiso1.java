package panelBus;

import javax.swing.*;
import java.awt.*;

public class BotonPiso1 extends JPanel{
	public BotonPiso1(){
		this.setBounds(800,400,220,100);
		this.setBackground(Color.darkGray);
		this.setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("Piso 1", 60, 60);
	}
}