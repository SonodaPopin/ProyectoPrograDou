package panelPrincipal;

import javax.swing.*;
import main.SelectorCiudad;
import java.awt.*;

import Ciudades.*;
import main.EnumCiudades;

public abstract class BotonDestino extends JPanel{
	int actual;
	Ciudad d;
	FlechaDerecha fd;
	FlechaIzquierda fi;
	public void Siguiente() {
		actual++;
		this.remove(d);
    	d = EnumCiudades.getCiudad(actual);
    	this.add(d);
    	this.repaint();
	}
	public void Anterior() {
		actual--;
		this.remove(d);
    	d = EnumCiudades.getCiudad(actual);
    	this.add(d);
    	this.repaint();
	}
}
