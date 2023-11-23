package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonDestinoVuelta extends JPanel{
	Destino d;
	FlechaDerecha fd;
	FlechaIzquierda fi;
    BotonDestinoVuelta(){
    	d = new Destino();
    	fd = new FlechaDerecha();
    	fi = new FlechaIzquierda();
        this.setBounds(430,150,550,60);
        this.setBackground(Color.WHITE);
        this.add(d);
        this.add(fd);
        this.add(fi);
    }

}
