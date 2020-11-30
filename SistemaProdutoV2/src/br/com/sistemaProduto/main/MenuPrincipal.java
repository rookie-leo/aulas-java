package br.com.sistemaProduto.main;

import java.util.Scanner;

import br.com.sistemaProduto.acoes.Action;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner kB = new Scanner(System.in);
		int op = 0;
		Action acao = new Action();
		
		while(op != 6) {
			System.out.print("\n|||||||||| -Sistema de Produtos- ||||||||||"
					+ "\n1. Cadastrar produto"
					+ "\n2. Mostrar todos os produtos"
					+ "\n3. Mostrar um produto"
					+ "\n4. Alterar informações do produto"
					+ "\n5. Excluir produto"
					+ "\n6. SAIR\n"
					+ "Digite a opção: ");
			op = kB.nextInt();
			
			switch(op) {
			case 1:
				System.out.print("Digite o nome do produto: ");
				String nome = kB.next().trim();
				System.out.print("\nDigite o preco do produto: ");
				double preco = kB.nextDouble();
				System.out.print("\nDigite a quantidade de produtos: ");
				int qtde = kB.nextInt();
				acao.cadastrarProduto(nome, qtde, preco);
				break;
			case 2:
				acao.mostrarTodosProdutos();
				break;
			case 3:
				System.out.print("   1. Pesquisar por nome.\n"
						+ "   2. Pesquisar produto pelo código.\n"
						+ "      Digite a forma de pesquisa: ");
				op = kB.nextInt();
				if(op == 1) {
						System.out.print("Digite o nome do produto corretamente: ");
						nome = kB.next();
						acao.mostrarProdutoPorNome(nome);
						break;
				}else if(op == 2) {
					System.out.print("Digite o código do produto: ");
					int cod = kB.nextInt();
					acao.mostrarProdutoPorCod(cod);
					break;
				}else System.err.println("Opção invalida");
			case 4:
				System.out.print("Digite o código do produto: ");
				int cod = kB.nextInt();
				/*System.out.print("Quais informações gostaria de alterar?\n"
						+ "1. Nome do produto\n"
						+ "2. Alterar a quantidade\n"
						+ "4. Alterar tudo\n");*/
					System.out.print("Digite o novo nome do produto: ");
					nome = kB.next();
					System.out.print("Digite a nova quantidade de produtos: ");
					qtde = kB.nextInt();
					System.out.print("Digite o novo preço do produto: R$ ");
					preco = kB.nextDouble();
					acao.alterarProdutoPorCod(cod, nome, qtde, preco);
					break;					
			case 5:
				System.out.print("Digite o código do produto que será apagado: ");
				cod = kB.nextInt();
				acao.excluirProduto(cod);
				break;
			case 6:
				System.out.println("Sistema encerrado!");
			}
		}
	
	}
}
