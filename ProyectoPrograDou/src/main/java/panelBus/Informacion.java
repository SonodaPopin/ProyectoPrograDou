package panelBus;

import javax.swing.*;
import java.awt.*;

public class Informacion extends JPanel{
	private int numpanel;
	Font font = new Font("Arial", Font.BOLD, 20);
	Font font30 = new Font("Arial", Font.BOLD, 30);
	public Informacion(int numpanel){
		this.setBounds(800,50,220,300);
		this.setBackground(new Color(100, 100, 100, 230));
		this.setLayout(null);
		this.numpanel = numpanel;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillRect(20, 60, 40, 60);

		g.setColor(Color.GREEN);
		g.fillRect(20, 140, 40, 60);

		g.setColor(Color.YELLOW);
		g.fillRect(20, 220, 40, 60);

		g.setColor(Color.white);
		g.setFont(font);
		g.drawString("Ocupado", 70, 100);
		g.drawString("Libre", 70, 180);
		g.drawString("Premium", 70, 260);

		switch (numpanel) {
			case 1:
				g.setColor(Color.WHITE);
				g.setFont(font30);
				g.drawString("Bus de Ida", 30, 40);
				break;
			case 2:
				g.setColor(Color.WHITE);
				g.setFont(font30);
				g.drawString("Bus de Vuelta", 8, 40);
				break;
			default:
				break;
		}
	}
}
