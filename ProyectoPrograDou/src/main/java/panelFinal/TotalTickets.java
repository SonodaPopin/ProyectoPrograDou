package panelFinal;

import java.awt.*;

import javax.swing.*;

/**
 * Clase que representa un panel que muestra el total de tickets y cual es el ticket mostrado actualmente
 */
public class TotalTickets extends JPanel{
	private int cantidad;
	private int actual;
	FlechaIzquierdaTicket fdt;
	FlechaDerechaTicket fit;
    PanelReservas pr;
	/**
	 * Método que crea el panel
	 * @param pr - Panel sobre el que se crea
	 * @param cantidad - total de tickets
	 */
	public TotalTickets(PanelReservas pr, int cantidad){
		actual = 0;
        this.setBounds(0,0,550,100);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.cantidad = cantidad;
        fdt = new FlechaIzquierdaTicket(pr);
        fit = new FlechaDerechaTicket(pr, cantidad);

        this.pr = pr;
        this.add(fdt);
        this.add(fit);
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 35);
        g.setFont(font);
        g.drawString("Tickets: " + (pr.getActual() + 1) + "/" + cantidad, 170, 65);
    }
}