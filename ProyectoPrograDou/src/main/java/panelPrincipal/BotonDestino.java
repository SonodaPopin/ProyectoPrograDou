package panelPrincipal;

import javax.swing.*;

import Ciudades.*;

/**
 * Clase que representa un panel interactivo para elegir una ciudad
 */
public abstract class BotonDestino extends JPanel{
	private EnumCiudades[] destinos = EnumCiudades.values();
	protected int actual;
	protected Ciudad d;
	protected FlechaDerecha fd;
	protected FlechaIzquierda fi;
	/**
	 * Método para cambiar a la siguiente ciudad en la lista
	 */
	public void Siguiente() {
		actual++;
		this.remove(d);
    	d = EnumCiudades.getCiudad(actual);
    	this.add(d);
    	this.repaint();
	}
	/**
	 * Método para cambiar a la ciudad anterior en la lista
	 */
	public void Anterior() {
		actual--;
		this.remove(d);
    	d = EnumCiudades.getCiudad(actual);
    	this.add(d);
    	this.repaint();
	}
	/**
	 * Método para obtener el nombre de la ciudad actualmente seleccionada
	 * @return - nombre de la ciudad seleccionada
	 */
	public String getDestino() {
		EnumCiudades destino = destinos[actual];
		String ciudad = destino.name();
		return ciudad;
	}

	/**
	 * Método para obtener la posición actual en la lista de ciudades
	 * @return - posición actual
	 */
	public int getActual() {
		return actual;
	}
	/**
	 * Método para cambiar la posición actual en la lista de ciudades
	 * @param dou - nueva posición actual
	 */
	public void setActual(int dou) {
		this.actual = dou;
	}
}
