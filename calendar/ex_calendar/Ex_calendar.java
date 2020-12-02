package calendar.ex_calendar;

import java.util.Calendar;

public class Ex_calendar {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();
		System.out.printf("Fatura gerada: %tc\n", agora);
		
		agora.add(Calendar.DATE, +10);
		System.out.printf("Vencimento: %tc\n", agora);
		if(Calendar.DAY_OF_WEEK == 7 ) {
			agora.add(Calendar.DATE, +1);
		}else if(Calendar.DAY_OF_WEEK == 6) {
			agora.add(Calendar.DATE, +2);			
		}
		System.out.printf("Vencimento: %tc\n", agora);
	}
}
