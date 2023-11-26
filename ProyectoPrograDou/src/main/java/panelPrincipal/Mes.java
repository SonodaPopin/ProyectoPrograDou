package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Mes extends Fechas{
    Mes(){
    	if (actual == 0) {
    		actual = 11;
    	}
    	fa = new FlechaArriba(this);
    	faa = new FlechaAbajo(this);
    	n = EnumNumeros.getNumero(actual);
        this.setBounds(80,70,80,130);
        this.setLayout(null);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
	public void Siguiente() {
		if(actual < 12) {
			actual++;
			limit = 0;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
		if(actual == 12) {
			limit = 1;
		}
	}
	public void Anterior() {
		if(actual > 1) {
			limit = 0;
			actual--;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
		if(actual == 1) {
			limit = -1;
		}
	}
}