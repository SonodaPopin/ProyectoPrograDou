package panelFinal;

import java.awt.*;

import javax.swing.*;

public class TotalPrecios extends JPanel{
	int preciofinal;
	public TotalPrecios(int preciofinal){
        this.setBounds(0,470,550,100);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.preciofinal = preciofinal;
	}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 35);
        g.setFont(font);
        g.drawString("Precio Total: " + preciofinal, 90, 65);
    }
}