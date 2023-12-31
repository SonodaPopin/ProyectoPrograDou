package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase que representa un ticket de bus
 */
public class Ticket extends JPanel implements MouseListener{
	PanelTickets pt;
	private int coorx, coory;
    private int pisos;
    private int tipo;
    private String hora;
    Font font15 = new Font("Arial", Font.BOLD, 15);
    Font font20 = new Font("Arial", Font.BOLD, 20);
    Color AzulClaro = new Color(51,153,255);

    /**
     * Método para crear el panel
     * @param pt - panel sobre el que se crea
     * @param a - coordenada x
     * @param b - coordenada y
     * @param pisos - numero de pisos
     * @param tipo - Salón cama o semi cama
     * @param hora - Hora del viaje
     */
    Ticket(PanelTickets pt, int a, int b, int pisos, int tipo, String hora){
    	coorx = a;
    	coory = b;
    	this.pt = pt;
        this.pisos = pisos;
        this.hora = hora;
        this.tipo = tipo;
        this.setBounds(coorx,coory,250,150);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }
    /**
     * Método que entrega la hora del viaje
     * @return - hora
     */
    public String getHora(){
        return hora;
    }
    /**
     * Método que entrega los pisos del bus
     * @return - pisos
     */
    public int getPisos() {
    	return pisos;
    }
    /**
     * Método que entrega el tipo de bus
     * @return - Semi cama o Salón cama
     */
    public int getTipo() {
    	return tipo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (tipo) {
            case 1:
                g.setColor(Color.WHITE);
                g.setFont(font20);
                g.drawString("Semi", 160, 70);
                g.drawString("Cama", 160, 90);
                break;
            case 2:
                g.setColor(Color.WHITE);
                g.setFont(font20);
                g.drawString("Salon", 160, 70);
                g.drawString("Cama", 160, 90);
                break;
            default:
                break;
        }

        g.setColor(Color.WHITE);
        g.setFont(font15);
        g.drawString(getHora(),205,135);


        g.setColor(Color.WHITE);
        g.setFont(font15);
        g.drawString("Hora:", 160, 135);

        personalizar(g);
    }
    /**
     * Método que dibuja el bus según su número de pisos
     * @param g
     */
    private void personalizar(Graphics g) {
        switch (pisos) {
            case 1:
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(20, 55, 100, 35);

                g.setColor(Color.BLACK);
                g.drawRect(20, 55, 100, 35);

                g.setColor(AzulClaro);
                g.fillRect(25, 60, 20, 15);
                g.fillRect(50, 60, 20, 15);
                g.fillRect(75, 60, 20, 15);
                g.fillRect(100, 60, 20, 15);

                g.setColor(Color.DARK_GRAY);
                g.fillOval(30, 80, 20, 20);
                g.fillOval(90, 80, 20, 20);

                break;
            case 2:
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(20, 35, 100, 35);
                g.fillRect(20, 70, 100, 35);
                g.setColor(Color.BLACK);
                g.drawRect(20, 70, 100, 35);
                g.drawRect(20, 35, 100, 35);

                g.setColor(AzulClaro);
                g.fillRect(25, 75, 20, 15);
                g.fillRect(50, 75, 20, 15);
                g.fillRect(75, 75, 20, 15);
                g.fillRect(100, 75, 20, 15);
                g.fillRect(25, 40, 20, 15);
                g.fillRect(50, 40, 20, 15);
                g.fillRect(75, 40, 20, 15);
                g.fillRect(100, 40, 20, 15);

                g.setColor(Color.DARK_GRAY);
                g.fillOval(30, 95, 20, 20);
                g.fillOval(90, 95, 20, 20);

                break;

            default:
                break;
        }
    }
	@Override
	public void mouseClicked(MouseEvent e) {

		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		pt.seleccionar(this);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(pt.seleccionado!=this) {
			this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(pt.seleccionado!=this) {
			this.setBorder(BorderFactory.createEmptyBorder());
		}
	}
}

