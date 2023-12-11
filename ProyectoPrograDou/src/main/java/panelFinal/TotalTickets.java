package panelFinal;

import java.awt.Color;

import javax.swing.*;

public class TotalTickets extends JPanel{
	private int cantidad;
	private int actual;
	FlechaDerechaTicket fdt;
	FlechaIzquierdaTicket fit;
	public TotalTickets(PanelReservas pr, int cantidad){
		actual = 0;
        this.setBounds(0,0,550,100);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.cantidad = cantidad;
        fdt = new FlechaDerechaTicket(pr);
        fit = new FlechaIzquierdaTicket(pr, cantidad);
        
        this.add(fdt);
        this.add(fit);
	}
}