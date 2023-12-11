package main;

import panelPrincipal.*;
import panelBus.Asiento;

public class Pasaje {
	private String partida, destino;
	private int dia, mes, año;
	private String hora;
	private int tipo;
	private int pisos;
	
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
	public int getTipo() {
		return tipo;
	}
	public String getFecha() {
		String fecha = dia+"/"+mes+"/"+año+" "+hora; 
		return fecha;
	}
	public String getPartida() {
		return partida;
	}
	public String getDestino() {
		return destino;
	}
}
