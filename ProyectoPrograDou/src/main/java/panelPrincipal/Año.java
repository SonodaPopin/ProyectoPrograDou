package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import numeros.*;

/**
 * Clase que representa un año mostrando un panel con un número
 */
public class Año extends Fechas{
    /**
     * Método constructor que crea el panel
     */
    public Año(){
    	if (actual == 0) {
    		actual = 23;
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
		if(actual == 23) {
			actual++;
			limit = 1;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
	}
	public void Anterior() {
		if(actual == 24) {
			actual--;
			limit = -1;
			this.remove(n);
			n = EnumNumeros.getNumero(actual);
			this.add(n);
			this.repaint();
		}
	}
}