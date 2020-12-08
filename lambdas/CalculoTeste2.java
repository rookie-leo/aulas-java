package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> {return x + y;};//função lambdas
		System.out.println(soma.executar(2, 3));
		
		Calculo multi = (x, y) -> {return x ;};
		System.out.println(multi.executar(5, 7));
		
		Calculo calc = (j, l) -> {return j + l;};
		System.out.println(calc.executar(7, 2));
		
		calc = (j, l) -> j * l;
		System.out.println(calc.executar(10, 2));
		
		System.out.println(calc.legal());
	}
}
