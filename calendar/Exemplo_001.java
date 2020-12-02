package calendar;

import java.util.Calendar;

public class Exemplo_001 {

	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();
		System.out.println("A data correta é: " + agora.getTime());
		/*Retorna a data atual*/
		
		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atrás: " + agora.getTime());
		/*Retorna a data de 15 dias atrás da data atual*/
		
		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses depois: " + agora.getTime());
		/*Retorna a data 4 meses a frente da data atual*/
		
		agora.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + agora.getTime());
		/*Retorna a data 2 anos a frente da data atual*/
	}
}
