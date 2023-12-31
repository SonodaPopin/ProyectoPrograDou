package main;

import java.util.ArrayList;
import panelBus.Asiento;

/**
 * Esta clase sirve como deposito para guardar asientos
 */
public class AsientosSelec {
    private ArrayList<Asiento> almacen;

    /**
     * Método para crear el depósito
     */
    public AsientosSelec(){
        almacen = new ArrayList<Asiento>();
    }

    /**
     * Método para añadir un asiento al depósito
     * @param a - asiento a añadir
     */
    public void addAsiento(Asiento a){
        almacen.add(a);
    }
    /**
     * Método para eliminar un asiento del depósito
     * @param a - asiento a eliminar
     */
    public void removeAsiento(Asiento a) {
    	for(int i=0; i<getCantidad(); i++) {
    		if (almacen.get(i) == a) {
    			almacen.remove(i);
    		}
    	}
    }

    /**
     * Método para obtener un asiento del depósito
     * @return asiento obtenido
     */
    public Asiento getAsiento(int a){
        Asiento x = almacen.get(a);
        return x;
    }

    /**
     * Método para saber la cantidad de Asientos restantes en el depósito
     * @return número de Asientos restantes
     */
    public int getCantidad() {
        return almacen.size();
    }
    /**
     * Método para saber el precio sumado de todos los asientos guardados
     * @return - precio total
     */
    public int getPrecioTotal() {
		int total = 0;
    	for(int i=0; i<getCantidad(); i++) {
    		total = total + almacen.get(i).getPrecio();
    		}
    	return total;
    }
}

