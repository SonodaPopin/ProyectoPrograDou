package panelFinal;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import main.AsientosSelec;

public class PanelReservas extends JPanel{
	private ArrayList<FinalTicket> ft;
	private int actual;
	private int tickets;
	private int precios;
	private TotalPrecios tp;
	private TotalTickets tt;
	public PanelReservas(ArrayList<FinalTicket> ft, int preciofinal, int cantidad){
		this.ft = ft;
		actual = 0;
        this.setBounds(430,50,550,570);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        
        tp = new TotalPrecios(preciofinal);
        tt = new TotalTickets(this, cantidad);
        
        this.add(tp);
        this.add(tt);
        this.add(ft.get(actual));
	}
	public void cambiarTicket(int a) {
		this.remove(ft.get(actual));
		actual = actual + a;
		this.add(ft.get(actual));
		this.repaint();
	}
	public int getActual() {
		return actual;
	}
}
