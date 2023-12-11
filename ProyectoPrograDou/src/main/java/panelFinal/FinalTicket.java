package panelFinal;

import java.awt.*;

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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 35);
        g.setFont(font);
        g.drawString("Asiento:  " + nombre, 50, 60);
        g.drawString("Piso:  " + piso, 50, 100);
        g.drawString("Fecha:  " + fecha, 50, 140);
        g.drawString("Partida:  " + partida, 50, 180);
        g.drawString("Destino:  " + destino, 50, 220);
        g.drawString("Tipo:  " + tipo, 50, 260);
        g.drawString("Precio:  " + preciofinal, 50, 300);
    }
}
