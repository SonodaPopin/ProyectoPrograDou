package panelPrincipal;

import javax.swing.*;

import Ciudades.EnumCiudades;

import java.awt.*;
import java.awt.event.*;
import numeros.*;

public abstract class Fechas extends JPanel{
	protected int limit = 0;
	protected int actual = 0;
	FlechaArriba fa;
	FlechaAbajo faa;
	protected Numero n;
	public abstract void Siguiente();
	public abstract void Anterior();
	public int getActual() {
		return actual;
	}
}