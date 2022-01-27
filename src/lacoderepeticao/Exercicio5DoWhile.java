/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
package lacoderepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	public static void main(String[] args) {
		Scanner escreva4 = new Scanner(System.in);
		int num=0, soma=0;
		
		do 
		{
			System.out.println("Digite um número: ");
			num=escreva4.nextInt();		
			soma=soma+num;
			
		}while (num!=0);	
					
		System.out.println("A quantidade da soma é:  "+soma);
		
		escreva4.close();

	}
}
