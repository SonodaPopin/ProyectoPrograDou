package panelBus;

import java.util.Random;

/**
 * Clase Builder que arma Asientos decidiendo aleatoriamente si están ocupados o no
 */
public class AsientoBuilder {
	Random random = new Random();
	private PanelAsientos pa;
	private int coorx;
	private int coory;
    private int piso;
    private int precio, finalprecio;
    private String nombre;
    
    /**
     * Método para asignar el panel donde se mostrará el Asiento
     * @param pa - el panel
     * @return
     */
    public AsientoBuilder setPA(PanelAsientos pa){
    	this.pa = pa;
    	return this;
    }
    /**
     * Método para designar la coordenada x del panel donde se mostrará el ticket
     * @param coorx - coordenada x
     * @return
     */
    public AsientoBuilder setX(int coorx) {
    	this.coorx = coorx;
    	return this;
    }
    /**
     * Método para designar la coordenada y del panel donde se mostrará el ticket
     * @param coory - coordenada y
     * @return
     */
    public AsientoBuilder setY(int coory) {
    	this.coory = coory;
    	return this;
    }
    /**
     * Método para designar el piso donde se encuentra el asiento
     * @return
     */
    public AsientoBuilder setPiso(int piso) {
    	this.piso = piso;
    	return this;
    }
    public AsientoBuilder setPrecio(int precio) {
    	this.precio = precio;
    	return this;
    }
    /**
     * Método para designar aleatoriamente si el asiento está ocupado o no
     * @return
     */
    public AsientoBuilder setRandomPrecio() {
    	if (precio == 2) {
    		finalprecio = random.nextInt(2)+1;
    	}
    	else if(precio == 0) {
    		finalprecio = random.nextInt(2);
    	}
    	return this;
    }
    /**
     * Método para designar el nombre del asiento
     * @return
     */
    public AsientoBuilder setNombre(String nombre) {
    	this.nombre = nombre;
    	return this;
    }
    /**
     * Método para crear el asiento
     * @return - el asiento
     */
    public Asiento build() {
    	setRandomPrecio();
    	return new Asiento(pa, coorx, coory, piso, finalprecio, nombre);
    }
}
