package main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase que sirve para obtener la fecha actual cuando se ejecuta el programa
 */
public class DateActual {
	private int dia;
	private int mes;
	private int año;
	private Date ahora;
	/**
	 * Método constructor que guarda la fecha actual
	 */
	public DateActual(){
		ahora = new Date();
		SimpleDateFormat diaa = new SimpleDateFormat("dd");
		SimpleDateFormat mess = new SimpleDateFormat("MM");
		SimpleDateFormat añoo = new SimpleDateFormat("yy");
		dia = Integer.parseInt(diaa.format(ahora));
		mes = Integer.parseInt(mess.format(ahora));
		año = Integer.parseInt(añoo.format(ahora));
	}
	/**
	 * Método que compara la fecha actual con la fecha entregada y comprueba que la fecha entregada sea posterior a la actual
	 * @param d1 - día entregado
	 * @param m1 - mes entregado
	 * @param a1 - año entregado
	 * @return - 1 si la fecha actual es anterior o igual a la entregada, -1 si ocurre lo contrario
	 */
	public int comprobarFechaIda(int d1, int m1, int a1) {
		if(a1<año||(a1==año&&m1<mes)||(a1==año&&m1==mes&&d1<dia)) {
			return -1;
		}
		else {
			return 1;
		}
	}
	/**
	 * Método que compara dos fechas entregadas y comprueba que la segunda sea posterior a la primera
	 * @param d1 - día de la primera fecha
	 * @param m1 - mes de la primera fecha
	 * @param a1 - año de la primera fecha
	 * @param d2 - día de la segunda fecha
	 * @param m2 - mes de la segunda fecha
	 * @param a2 - año de la segunda fecha
	 * @return - 1 si la fecha segunda fecha es posterior a la primera, -1 si ocurre lo contrario
	 */
	public int comprobarFechaVuelta(int d1, int m1, int a1, int d2, int m2, int a2) {
		if (a2 < a1 || (a2 == a1 && m2 < m1) || (a2 == a1 && m2 == m1 && d2 < d1)) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
