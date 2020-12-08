package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> primeira = 
			n -> n.charAt(0) + "";
			
	public static UnaryOperator<String> grito (){
		return 	n -> n + "!!! ";
	}
		
}
