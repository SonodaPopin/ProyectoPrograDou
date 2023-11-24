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
    	t1 = new Ticket(0,0);
    	t2 = new Ticket(300,0);
    	t3 = new Ticket(0,200);
    	t4 = new Ticket(300,200);
    	t5 = new Ticket(0,400);
    	t6 = new Ticket(300,400);
        this.setBounds(430,60,550,550);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setLayout(null);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
    }
}
