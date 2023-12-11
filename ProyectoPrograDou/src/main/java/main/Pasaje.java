package main;

import panelPrincipal.*;
import panelBus.Asiento;

/**
 * Clase que guarda algunos datos de un pasaje
 */
public class Pasaje {
	private String partida, destino;
	private int dia, mes, año;
	private String hora;
	private int tipo;
	private int pisos;
	
	/**
	 * Método que crea el pasaje
	 * @param partida - punto de partida
	 * @param destino - punto de destino
	 * @param pt - PanelTickets del que se extraen datos
	 * @param bf - BotonFecha del que se extraen datos
	 */
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
	/**
	 * Método para obtener el número de pisos
	 * @return pisos
	 */
	public int getPisos() {
		return pisos;
	}
	/**
	 * Método para obtener el tipo de bus
	 * @return tipo
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * Método para obtener la fecha del viaje
	 * @return fecha
	 */
	public String getFecha() {
		String fecha = dia+"/"+mes+"/"+año+" "+hora; 
		return fecha;
	}
	/**
	 * Método para obtener el punto de partida
	 * @return punto de partida
	 */
	public String getPartida() {
		return partida;
	}
	/**
	 * Método para obtener el punto de destino
	 * @return punto de destino
	 */
	public String getDestino() {
		return destino;
	}
}
