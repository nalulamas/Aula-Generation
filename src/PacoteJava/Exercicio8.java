/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.  
 */
package PacoteJava;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String[] args) {
		Scanner leia7= new Scanner (System.in);
		double carroNovo, custoFabrica;
		System.out.println("Informe o custo de fábrica do seu carro para calcularmos o valor de revenda: R$");
		custoFabrica=leia7.nextDouble();
		
		carroNovo = (custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45));
		
				System.out.println("\nO valor de revenda é: R$"+ carroNovo);
				leia7.close();
			
	}

}
