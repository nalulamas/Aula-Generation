/*1- Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
 
package Matrizes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] vet = new int [5];
		int num=0, plus=0 ;
		
		for (num=0; num<5; num++) 
		{
		System.out.println("\nEscreva 5 numeros: ");		
		vet[num]= ler.nextInt();

			if(vet[num]>plus)
			{
				plus=vet[num];
			}
		}			
		
		System.out.println("\nO maior numero �: "+plus);
		ler.close();	
		
	}
}