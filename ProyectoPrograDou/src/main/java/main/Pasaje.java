package main;

import panelPrincipal.*;
import panelBus.Asiento;

public class Pasaje {
	private String partida, destino;
	private int dia, mes, año;
	private String hora, tipo;
	private int pisos;
	
	private int pisoselec;
	private int precio;
	private String Asiento;
	public Pasaje(String partida, String destino, PanelTickets pt, BotonFecha bf){
		this.partida = partida;
		this.destino = destino;
		hora = pt.getSeleccionado().getHora();
		tipo = pt.getSeleccionado().getTipo();
		pisos = pt.getSeleccionado().getPisos();
		dia = bf.getFecha()[0];
		mes = bf.getFecha()[1];
		año = bf.getFecha()[2];
	}
	public int getPisos() {
		return pisos;
	}
	public void setAsiento(Asiento a) {
		pisoselec = a.getPiso();
		precio = a.getPrecio();
		Asiento = a.getNombre();
	}
}
