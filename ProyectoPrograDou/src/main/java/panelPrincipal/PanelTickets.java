package panelPrincipal;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un panel sobre el que se muestran los tickets
 */
public class PanelTickets extends JPanel {
	Random random;
	Ticket seleccionado = null;
	Ticket t1;
	Ticket t2;
	Ticket t3;
	Ticket t4;
	Ticket t5;
	Ticket t6;
	private int mensaje;
	Font font30 = new Font("Arial", Font.BOLD, 30);
    /**
     * Método que crea el panel
     * @param mensaje - numero que decide entre dos opciones que mensaje se mostrará en el panel
     */
    public PanelTickets(int mensaje){
		this.mensaje = mensaje;
    	random = new Random();
    	t1 = createTicket(0,80);
    	t2 = createTicket(300,80);
    	t3 = createTicket(0,250);
    	t4 = createTicket(300,250);
    	t5 = createTicket(0,420);
    	t6 = createTicket(300,420);
        this.setBounds(430,50,550,570);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setLayout(null);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
    }
	/**
	 * Método que crea un ticket aleatorio
	 * @param a - coordenada x
	 * @param b - coordenada y
	 * @return - el ticket
	 */
	public Ticket createTicket(int a, int b){
		String hora;
		int c = random.nextInt(2)+1;
		int d = random.nextInt(2)+1;
		int e = random.nextInt(24);		
		int g = random.nextInt(6);
		if (e>9) {
			hora = e+":"+g+"0";
		}
		else {
			hora = "0"+e+":"+g+"0";
		}
		Ticket ticket = new Ticket(this,a,b,c,d,hora);
		return ticket;
	}
	/**
	 * Método que establece el ticket seleccionado por el usuario
	 * @param seleccionado - ticket seleccionado
	 */
	public void seleccionar(Ticket seleccionado){
		if (this.seleccionado != null){
			this.seleccionado.setBorder(BorderFactory.createEmptyBorder());
		}
		this.seleccionado = seleccionado;
		seleccionado.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	}
	/**
	 * Método que entrega el ticket seleccionado por el usuario
	 * @return - ticket seleccionado
	 */
	public Ticket getSeleccionado() {
		return seleccionado;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		switch (mensaje) {
			case 1:
				g.setColor(Color.BLACK);
				g.fillRect(180,15,170,45);

				g.setColor(Color.WHITE);
				g.setFont(font30);
				g.drawString("Pasaje Ida",190,45);
				break;
			case 2:
				g.setColor(Color.BLACK);
				g.fillRect(160,15,220,45);

				g.setColor(Color.WHITE);
				g.setFont(font30);
				g.drawString("Pasaje Vuelta",170,45);
				break;
			default:
				break;
		}
	}
}
