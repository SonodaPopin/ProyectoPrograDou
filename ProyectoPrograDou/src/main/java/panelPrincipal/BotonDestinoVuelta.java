package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import destinos.*;

public class BotonDestinoVuelta extends JPanel{
	Destino d;
	FlechaDerecha fd;
	FlechaIzquierda fi;
    BotonDestinoVuelta(){
    	d = new Santiago();
    	fd = new FlechaDerecha();
    	fi = new FlechaIzquierda();
        this.setBounds(430,150,550,60);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.add(d);
        this.add(fd);
        this.add(fi);
    }

}
