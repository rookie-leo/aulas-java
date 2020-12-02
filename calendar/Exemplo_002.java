package calendar;

import java.util.Calendar;

public class Exemplo_002 {

	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();
		
		System.out.printf("%tc\n", agora);
		/*Retorna dia da semana atual, mes atual, dia do mes, e hora
		 * Exemplo: qua dez 02 16:53:52 BRT 2020*/
		
		System.out.printf("%tF\n", agora);
		/*Retorna ano, mes dia
		 * Exemplo: 2020-09-27*/
		
		System.out.printf("%tD\n", agora);
		/*Retorn mes, dia, anos
		 * Exemplo: 09/27/20*/
		
		System.out.printf("%tr\n", agora);
		/*Retorna o horário no padrão 12hrs
		 * Exemplo: 04:53:52 PM*/
		
		System.out.printf("%tT\n", agora);
		/*Retorna o horário no padrão 24hrs
		 * Exemplo: 16:53:52*/
	}
}
