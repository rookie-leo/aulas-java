package praticandojava;

import java.util.Scanner;/*importa a bibliotaca Scanner para fazer leitura do 
teclado*/

public class PraticandoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcl = new Scanner(System.in);//Torna a variavel tcl um objeto
        System.out.print("Digite o seu nome: ");
        String nome = tcl.nextLine();//entrada de dados para a variável nome
        System.out.print(nome + " agora digite um número: ");//retorna a str digitada, e faz uma requisição de entrada type int
        int num1 = tcl.nextInt();//entrada de dados type int
        System.out.print("Digite outro número: ");
        int num2 = tcl.nextInt();//entrada de dados type int
        int soma = num1 + num2;//faz a soma entre os dois valores int digitados pelo user
        System.out.println("A soma entre os dois números digitados pelo " + nome
                + " é " + soma);//retorna a frase com o nome digitado concatenado com o valor da soma realizada
        System.out.print("Digite um número: ");
        float x1 = tcl.nextFloat();
        System.out.println(x1);
    }
    
}
