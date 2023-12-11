package panelFinal;

import java.awt.*;

import javax.swing.*;

/**
 * Clase que representa un panel que muestra el precio final de todos los tickets juntoss
 */
public class TotalPrecios extends JPanel{
	private int preciofinal;
	/**
	 * Método constructor del panel
	 * @param preciofinal - precio final a mostrar
	 */
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