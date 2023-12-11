package panelFinal;

import java.awt.Color;

import javax.swing.*;

import panelBus.Asiento;

public class FinalTicket extends JPanel{
	private String nombre;
	private int piso;
	private String fecha;
	private String partida;
	private String destino;
	private String tipo;
	private int preciofinal;
	public FinalTicket(Asiento a){
        this.setBounds(0,100,550,370);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        nombre = a.getNombre();
        piso = a.getPiso();
        fecha = a.getFecha();
        partida = a.getPartida();
        destino = a.getDestino();
        tipo = a.getTipo();
        preciofinal = a.getPrecio();
	}
}
