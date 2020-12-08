package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioOperadorBinarioTentativa2 {

	/*
	 * 1. A partir do produto calcular o preco real(valor com desconto)
	 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500(Isento)
	 * 3. Frete: >= 3000 (100)/ < 3000(50)
	 * 4. Arredondar: Deixar duas casas decimais apos a virgula
	 * 5. Formatar: R$1234,56
	 * */
	
	public static void main(String[] args) {
		
		Function<Produto, Double> preco = prod -> prod.preco * (1 - prod.desconto);  
		UnaryOperator<Double> impostoMunicipal = num -> num >= 2500 ? num * 1.085 : num;
		UnaryOperator<Double> frete = frt -> frt >= 3000 ? frt + 100 : frt + 50;
		UnaryOperator<Double> arredondar = f -> Double.parseDouble(String.format("%.2f", f).replace(",", "."));
		Function<Double, String> formatar = form -> ("R$" + form).replace(".", ",");
		
		Produto p = new Produto("Celular", 1099.85, 0.20);
		
		String total = preco.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.printf("O total é R$ %s", total);
	}
}
