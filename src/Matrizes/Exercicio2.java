/*	2- Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o. 	 */
package Matrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int[] vet = new int[10];
		int lanc = 0, media = 0, soma = 0, cont = 0, plus = 0, rep = 0;

		for (lanc = 0; lanc <= 9; lanc++) {
			System.out.println("Digite o valor do lan�amento: ");
			vet[lanc] = leia.nextInt();

			if (vet[lanc] >= 0) {
				soma = soma + vet[lanc];
				cont++;
				media = soma / cont;
			}

			if (vet[lanc] > plus) {
				plus = vet[lanc];
			}

		}
		for (lanc = 0; lanc <= 9; lanc++) {
			if (plus == vet[lanc]) {
				rep++;
			}
		}
		leia.close();

		System.out.println("\nA maior pontua��o foi: " + plus);
		System.out.println("\nA media dos lan�amentos foi: " + media);
		System.out.println("\nOs maiores valores repetiram: " + rep + " vezes.");
	}
}


