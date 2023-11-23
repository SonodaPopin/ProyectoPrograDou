package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Año extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
    Año(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
        this.setBounds(160,70,80,130);
        this.setBackground(Color.PINK);
        this.add(fa);
        this.add(faa);
    }
}