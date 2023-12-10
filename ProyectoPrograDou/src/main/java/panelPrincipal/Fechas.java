package panelPrincipal;

import javax.swing.*;

import Ciudades.EnumCiudades;

import java.awt.*;
import java.awt.event.*;
import numeros.*;

/**
 * Clase que representa una fecha mostrando un panel con un número
 */
public abstract class Fechas extends JPanel{
	protected int limit = 0;
	protected int actual = 0;
	FlechaArriba fa;
	FlechaAbajo faa;
	protected Numero n;
	/**
	 * Método para cambiar el número al entero siguente
	 */
	public abstract void Siguiente();
	/**
	 * Método para cambiar el número al entero anterior
	 */
	public abstract void Anterior();
	/**
	 * Método para obtener el número actual
	 * @return - número mostrado actual
	 */
	public int getActual() {
		return actual;
	}
}