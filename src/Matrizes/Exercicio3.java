package Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int numRandom = random.nextInt(1, 9);

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int linha = 0, coluna = 0;

		// N1
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				N1[linha][coluna] = numRandom;

			}
		}

		// N2_______________________________

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				N2[linha][coluna] = numRandom;

			}
		}
		System.out.print("\n");

		// M1________________________________
		System.out.print("Matriz M1:\n");
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print("\t" + M1[linha][coluna]);

			}
			System.out.print("\n");

		}
		System.out.print("Matriz M2:\n");
		// M2________________________________
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print("\t" + M1[linha][coluna]);

			}leia.close();
			System.out.print("\n");

		}

	}
}
