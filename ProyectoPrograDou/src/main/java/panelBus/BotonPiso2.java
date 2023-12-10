package panelBus;

import javax.swing.*;
import java.awt.*;

public class BotonPiso2 extends JPanel{
	public BotonPiso2(){
		this.setBounds(800,520,220,100);
		this.setBackground(Color.darkGray);
		this.setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("Piso 2", 60, 60);
	}
}