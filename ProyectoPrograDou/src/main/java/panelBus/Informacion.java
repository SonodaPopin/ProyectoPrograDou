package panelBus;

import javax.swing.*;
import java.awt.*;

public class Informacion extends JPanel{
	public Informacion(int numpanel){
		this.setBounds(800,50,220,300);
		this.setBackground(new Color(100, 100, 100, 230));
		this.setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillRect(20,40,40,60);

		g.setColor(Color.GREEN);
		g.fillRect(20,120,40,60);

		g.setColor(Color.YELLOW);
		g.fillRect(20,200,40,60);

		g.setColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Ocupado", 70, 80);
		g.drawString("Libre", 70, 160);
		g.drawString("Premium", 70, 240);
	}
}
