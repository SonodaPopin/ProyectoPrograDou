package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonDestinoIda extends JPanel{
	Destino d;
	FlechaDerecha fd;
	FlechaIzquierda fi;
    BotonDestinoIda(){
    	d = new Destino();
    	fd = new FlechaDerecha();
    	fi = new FlechaIzquierda();
        this.setBounds(430,50,550,60);
        this.setBackground(Color.WHITE);
        this.add(d);
        this.add(fd);
        this.add(fi);
    }

}
