package classeDateFormat.ex_dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_DateFormat {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyy hh:mm:ss:SSS");
		
		String dtf = formatter.format(agora);
		System.out.println(dtf);
		
	}
}
