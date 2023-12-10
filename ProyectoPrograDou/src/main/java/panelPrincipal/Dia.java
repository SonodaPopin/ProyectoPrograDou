package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

public class Dia extends Fechas{
    public Dia(){
    	if (actual == 0) {
    		actual = 26;
    	}
    	fa = new FlechaArriba(this);
    	faa = new FlechaAbajo(this);
    	n = EnumNumeros.getNumero(actual);
        this.setBounds(0,70,80,130);
        this.setLayout(null);
        this.add(fa);
        this.add(faa);
        this.add(n);
    }
	public void Siguiente() {
		if(actual < 31) {
			limit = 0;
			actual++;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
		if(actual == 31) {
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