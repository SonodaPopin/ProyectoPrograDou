package main;

import panelPrincipal.*;

public class Pasaje {
	String partida, destino;
	int dia, mes, año;	
	String hora, tipo;
	int pisos;
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
}
