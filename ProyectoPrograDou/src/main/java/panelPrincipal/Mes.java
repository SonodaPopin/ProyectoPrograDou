package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mes extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
    Mes(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
        this.setBounds(80,70,80,130);
        this.setBackground(Color.GREEN);
        this.add(fa);
        this.add(faa);
    }
}