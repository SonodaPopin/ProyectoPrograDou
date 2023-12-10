package panelPrincipal;

import java.util.Random;

/**
 * Clase Builder que arma Tickets con algunos datos aleatorios
 */
public class TicketBuilder {
	Random random = new Random();
	private PanelTickets pt;
	private int coorx, coory;
    private int pisos;
    private int tipo;
    private String hora;
    
    /**
     * Método para asignar el panel donde se mostrará el ticket
     * @param pt - el panel
     * @return
     */
    public TicketBuilder setPT(PanelTickets pt){
    	this.pt = pt;
    	return this;
    }
    /**
     * Método para designar la coordenada x del panel donde se mostrará el ticket
     * @param coorx - coordenada x
     * @return
     */
    public TicketBuilder setX(int coorx) {
    	this.coorx = coorx;
    	return this;
    }
    /**
     * Método para designar la coordenada y del panel donde se mostrará el ticket
     * @param coory - coordenada y
     * @return
     */
    public TicketBuilder setY(int coory) {
    	this.coory = coory;
    	return this;
    }
    /**
     * Método para designar una cantidad aleatoria de pisos entre 1 y 2
     * @return
     */
    public TicketBuilder setRandomPisos() {
    	pisos = random.nextInt(2)+1;
    	return this;
    }
    /**
     * Método para designar aleatoriamente el tipo de bus, 1 para semi cama y 2 para salón cama
     * @return
     */
    public TicketBuilder setRandomTipo() {
    	tipo = random.nextInt(2)+1;
    	return this;
    }
    /**
     * Método para designar una hora aleatoria de partida del bus
     * @return
     */
    public TicketBuilder setRandomHora() {
    	int a = random.nextInt(24);		
    	int b = random.nextInt(6);
    	if (a>9) {
    		hora = a+":"+b+"0";
    	}
    	else {
    		hora = "0"+a+":"+b+"0";
    	}
    	return this;
    }
    /**
     * Método para armar el ticket
     * @return - el ticket
     */
    public Ticket build() {
    	setRandomPisos();
    	setRandomTipo();
    	setRandomHora();
    	return new Ticket(pt, coorx, coory, pisos, tipo, hora);
    }
}
