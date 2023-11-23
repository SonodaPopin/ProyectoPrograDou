package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dia extends JPanel{
	FlechaArriba fa;
	FlechaAbajo faa;
    Dia(){
    	fa = new FlechaArriba();
    	faa = new FlechaAbajo();
        this.setBounds(0,70,80,130);
        this.setBackground(Color.BLUE);
        this.add(fa);
        this.add(faa);
    }
}