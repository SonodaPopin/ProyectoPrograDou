package panelPrincipal;

import javax.swing.*;

import Ciudades.*;

public abstract class BotonDestino extends JPanel{
	EnumCiudades[] destinos = EnumCiudades.values();
	protected int actual;
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
	public String getDestino() {
		EnumCiudades destino = destinos[actual];
		String ciudad = destino.name();
		return ciudad;
	}

	public int getActual() {
		return actual;
	}
	public void setActual(int dou) {
		this.actual = dou;
	}
}
