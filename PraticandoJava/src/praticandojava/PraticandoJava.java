/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticandojava;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PraticandoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = tcl.nextLine();
        System.out.print(nome + " agora digite um número: ");
        int num1 = tcl.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = tcl.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma entre os dois números digitados pelo" + nome+
                " é " + soma);
    }
    
}
