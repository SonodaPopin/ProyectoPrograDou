package panelPrincipal;

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class PanelTickets extends JPanel {
	Random random;
	Ticket t1;
	Ticket t2;
	Ticket t3;
	Ticket t4;
	Ticket t5;
	Ticket t6;
    PanelTickets(){
    	random = new Random();
    	t1 = createTicket(0,0);
    	t2 = createTicket(300,0);
    	t3 = createTicket(0,210);
    	t4 = createTicket(300,210);
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
		Ticket ticket = new Ticket(a,b,c,d,hora);
		return ticket;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);


	}
}
