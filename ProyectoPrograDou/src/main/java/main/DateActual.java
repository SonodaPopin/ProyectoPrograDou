package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActual {
	int dia;
	int mes;
	int año;
	public DateActual(){
		Date ahora = new Date();
		SimpleDateFormat diaa = new SimpleDateFormat("dd");
		SimpleDateFormat mess = new SimpleDateFormat("mm");
		SimpleDateFormat añoo = new SimpleDateFormat("yyyy");
		dia = Integer.parseInt(diaa.format(ahora));
		mes = Integer.parseInt(mess.format(ahora));
		año = Integer.parseInt(añoo.format(ahora));
	}
}
