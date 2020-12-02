package classeDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo002 {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFormatada = formatter.format(agora);
		
		System.out.println(dataFormatada);/*28/09/2020*/
	}
}
