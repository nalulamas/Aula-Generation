/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
package lacoderepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	public static void main(String[] args) {
		Scanner escreva4 = new Scanner(System.in);
		int num=0, soma=0;
		
		do 
		{
			System.out.println("Digite um n�mero: ");
			num=escreva4.nextInt();		
			soma=soma+num;
			
		}while (num!=0);	
					
		System.out.println("A quantidade da soma �:  "+soma);
		
		escreva4.close();

	}
}
