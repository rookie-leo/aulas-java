package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calcular  = new Somar();
		System.out.println(calcular.executar(2, 3));
		
		calcular = new Multiplicar();
		System.out.println(calcular.executar(2, 3));
	}
}
