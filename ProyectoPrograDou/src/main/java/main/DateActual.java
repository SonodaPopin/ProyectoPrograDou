package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActual {
	int dia;
	int mes;
	int año;
	Date ahora;
	public DateActual(){
		ahora = new Date();
		SimpleDateFormat diaa = new SimpleDateFormat("dd");
		SimpleDateFormat mess = new SimpleDateFormat("MM");
		SimpleDateFormat añoo = new SimpleDateFormat("yy");
		dia = Integer.parseInt(diaa.format(ahora));
		mes = Integer.parseInt(mess.format(ahora));
		año = Integer.parseInt(añoo.format(ahora));
	}
	public int comprobarFechaIda(int d1, int m1, int a1) {
		if(a1<año||(a1==año&&m1<mes)||(a1==año&&m1==mes&&d1<dia)) {
			return -1;
		}
		else {
			return 1;
		}
	}
	public int comprobarFechaVuelta(int d1, int m1, int a1, int d2, int m2, int a2) {
		if (a2 < a1 || (a2 == a1 && m2 < m1) || (a2 == a1 && m2 == m1 && d2 < d1)) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
