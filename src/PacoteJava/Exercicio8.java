/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.  
 */
package PacoteJava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String[] args) {
		Scanner leia7= new Scanner (System.in);
		double carroNovo, custoFabrica;
		System.out.println("Informe o custo de f�brica do seu carro para calcularmos o valor de revenda: R$");
		custoFabrica=leia7.nextDouble();
		
		carroNovo = (custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45));
		
				System.out.println("\nO valor de revenda �: R$"+ carroNovo);
				leia7.close();
			
	}

}
