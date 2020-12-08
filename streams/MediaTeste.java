package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media atv = new Media().adicionar(8.3).adicionar(6.7);
		Media atv2 = new Media().adicionar(7.9).adicionar(6.6);
		
		System.out.println(atv.getValor());
		System.out.println(atv2.getValor());
		System.out.println(Media.combinar(atv, atv2).getValor());
	}
}
