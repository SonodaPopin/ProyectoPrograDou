package panelFinal;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import main.AsientosSelec;

/**
 * Clase panel que muestra los tickets a reservar
 */
public class PanelReservas extends JPanel{
	private ArrayList<FinalTicket> ft;
	private int actual;
	private int tickets;
	private int precios;
	private TotalPrecios tp;
	private TotalTickets tt;
	/**
	 * Método que crea el panel
	 * @param ft - Arraylist de los tickets a mostrar
	 * @param preciofinal - precio final a mostrar
	 * @param cantidad - número de tickets a mostrar
	 */
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
	/**
	 * Método que cambia el ticket actualmente mostrado por el siguiente o anterior
	 * @param a
	 */
	public void cambiarTicket(int a) {
		this.remove(ft.get(actual));
		actual = actual + a;
		this.add(ft.get(actual));
		this.repaint();
	}
	/**
	 * Método que entrega la posición actual del ticket mostrado en el arraylist de tickets
	 * @return
	 */
	public int getActual() {
		return actual;
	}
}
