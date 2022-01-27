/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
package lacoderepeticao;

import java.util.Scanner;

public class Exercicio3WHILE {

	public static void main(String[] args) {
		Scanner escreva3 = new Scanner(System.in);
		int x=0, menores=0, maiores=0;
				
		while (x!=-99)
		{
			System.out.println("Qual a sua idade? ");
			x=escreva3.nextInt();
			if (x<21 && x>0)
			{
				menores++;
			}
			if(x>50)
			{
				maiores++;
			}
		}
		
		System.out.println("A quantidade de pessoas com idade menor que 21 é:  "+menores);
		System.out.println("A quantidade de pessoas com idade maior que 50 é: "+maiores);	
		escreva3.close();
	}

}
