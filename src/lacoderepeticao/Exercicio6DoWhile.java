/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */
package lacoderepeticao;

import java.util.Scanner;

public class Exercicio6DoWhile {
	public static void main(String[] args) {
		Scanner escreva5 = new Scanner(System.in);

		int num = 0, soma = 0, contadora=0;

		do {
			System.out.println("Digite um n�mero: ");
			num = escreva5.nextInt();
			
			if(num%3==0 && num!=0)
			{
				contadora++;
				soma=soma + num;
			}
			
		} while (num != 0);

		System.out.println("A m�dia dos m�ltiplos de 3 �: " + soma/contadora);

		escreva5.close();
	}
}
