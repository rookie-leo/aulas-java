package classeDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		/*Formata a data para o padrão DD/MM/AA HH:mm*/
		String dateToStirng = DateFormat.getInstance().format(agora);
		
		System.out.println(dateToStirng);/*28/09/2020 21:50*/
		
		dateToStirng = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(dateToStirng);/*28 de setembro de 2020 21:53*/
	}
}
