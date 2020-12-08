package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;



public class DesafioOperadorBinario {

	/*
	 * 1. A partir do produto calcular o preco real(valor com desconto)
	 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500(Isento)
	 * 3. Frete: >= 3000 (100)/ < 3000(50)
	 * 4. Arredondar: Deixar duas casas decimais apos a virgula
	 * 5. Formatar: R$1234,56
	 * */
	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal =
				prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> impostoMunicipal =
				num -> num >= 2500? num * 1.085: num;
		UnaryOperator<Double> frete = 
				frt -> frt >= 3000? frt + 100 : frt + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		Function<Double, String> formatar = 
				f -> ("R$" + f).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String total = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O total é R$ " + total);
	}
}
