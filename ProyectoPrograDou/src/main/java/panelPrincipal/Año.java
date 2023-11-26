package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Año extends Fechas{
    Año(){
    	if (actual == 0) {
    		actual = 22;
    	}
    	limit = -1;
    	fa = new FlechaArriba(this);
    	faa = new FlechaAbajo(this);
    	n = EnumNumeros.getNumero(actual);
        this.setBounds(160,70,80,130);
        this.setLayout(null);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
	public void Siguiente() {
		if(actual == 22) {
			actual++;
			limit = 1;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
	}
	public void Anterior() {
		if(actual == 23) {
			actual--;
			limit = -1;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
	}
}