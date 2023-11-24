package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticket extends JPanel {
    Ticket(int a, int b){
        this.setBounds(a,b,250,150);
        this.setBackground(Color.RED);
        this.setLayout(null);
    }
}
