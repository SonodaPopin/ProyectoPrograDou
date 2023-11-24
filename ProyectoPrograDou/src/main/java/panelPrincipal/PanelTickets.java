package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelTickets extends JPanel {
	Ticket t1;
	Ticket t2;
	Ticket t3;
	Ticket t4;
	Ticket t5;
	Ticket t6;
    PanelTickets(){
    	t1 = new Ticket(0,0,1,1,"20:00");
    	t2 = new Ticket(300,0,2,2,"15:30");
    	t3 = new Ticket(0,210,2,2,"dou");
    	t4 = new Ticket(300,210,1,1,"");
    	t5 = new Ticket(0,420,1,2,"");
    	t6 = new Ticket(300,420,2,1,"");
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

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);


	}
}
