package panelBus;

import javax.swing.*;

import panelPrincipal.PanelTickets;

import java.awt.*;
import java.awt.event.*;
import main.*;

public class Asiento extends JPanel implements MouseListener{
	private int selected = -1;
	private PanelAsientos pa;
	private int coorx;
	private int coory;
	private int precio;
	private Pasaje p;
	
	private String nombre;
	private int piso;
	private String fecha;
	private String partida;
	private String destino;
	private String tipo;
	private int preciofinal;
	
    public Asiento(PanelAsientos pa, int a, int b, int piso, int precio, String nombre){
    	this.pa = pa;
    	coorx = a;
    	coory = b;
        this.piso = piso;
        this.precio = precio;
        this.nombre = nombre;
        p = pa.getPB().getPasaje();
        this.setBounds(a,b,40,60);
        if(precio == 1) {
            this.setBackground(Color.RED);
        }
        else if(precio == 0) {
            this.setBackground(Color.GREEN);
            this.addMouseListener(this);
        }
        else if(precio == 2) {
        	this.setBackground(Color.YELLOW);
            this.addMouseListener(this);
        }
        this.setLayout(null);
        ExtraerDatos();
    }
    public void ExtraerDatos() {
    	fecha = p.getFecha();
    	partida = p.getPartida();
    	destino = p.getDestino();
    	preciofinal = 4000 + p.getTipo()*(4000 + precio*2000);
    	if(p.getTipo()==1) {
    		tipo = "Semi Cama";
    	}
    	else {
    		tipo = "Salón Cama";
    	}
    }
    public String getNombre() {
    	return nombre;
    }
    public int getPiso() {
    	return piso;
    }
    public String getFecha() {
    	return fecha;
    }
    public String getPartida() {
    	return partida;
    }
    public String getDestino() {
    	return destino;
    }
    public String getTipo() {
    	return tipo;
    }
    public int getPrecio() {
    	return preciofinal;
    }
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		Font font = new Font("Arial", Font.BOLD, 15);
		g.setFont(font);
		g.drawString(getNombre(), 10, 25);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(selected == -1) {
	        this.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	        pa.addAsiento(this);
	        selected = 1;
		}
		else {
			this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
			pa.removeAsiento(this);
			selected = -1;
		}		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(selected == -1) {
			this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(selected == -1) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}
