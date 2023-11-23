package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Dia extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
	Numero n;
    Dia(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
    	n = new Numero1();
        this.setBounds(0,70,80,130);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
}