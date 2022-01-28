package Matrizes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[][]= new int [3][3];
		int linha=0, coluna=0, adicao=0,  diagonal=0; 
				
				
				
				for(linha=0;linha<3;linha++)
					{
						for(coluna=0;coluna<3;coluna++)
						{
							System.out.print("Digite um numero: ");
							vet[linha][coluna]=leia.nextInt();
						}
					}

					
				for(linha=0;linha<3;linha++)
					{
						for(coluna=0;coluna<3;coluna++)
						{
							System.out.print("\t"+vet[linha][coluna]);					
						}
						System.out.print("\n");
					}	
					
			
				for(linha=0;linha<3;linha++)
				{
					for(coluna=0;coluna<3;coluna++)					
					 adicao= adicao+vet[linha][coluna];
					
				}
				
				
				for(coluna=0;coluna<3;coluna++)					
					 diagonal= diagonal+vet[coluna][coluna];
					
			
					
				System.out.print("\nSoma dos valores: "+ adicao);	
				System.out.print("\nSoma dos valores na diagonal: "+ diagonal);
	}
}
