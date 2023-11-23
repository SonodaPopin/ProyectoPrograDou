package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Mes extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
	Numero n;
    Mes(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
    	n = new Numero2();
        this.setBounds(80,70,80,130);
        this.setLayout(null);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
}