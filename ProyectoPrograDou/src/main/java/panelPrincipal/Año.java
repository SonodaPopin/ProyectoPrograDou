package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Año extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
	Numero n;
    Año(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
    	n = new Numero22();
        this.setBounds(160,70,80,130);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
}