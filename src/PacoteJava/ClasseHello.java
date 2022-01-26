/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.  
 */
package PacoteJava;

import java.util.Scanner;

public class ClasseHello {
	
	public static void main (String[] args) {
		int anos, meses, dias;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Quantos anos você tem?: ");
		anos= sc.nextInt();
		System.out.println("Quantos meses?: ");
		meses= sc.nextInt();
		System.out.println("Quantos dias?: ");
		dias= sc.nextInt();
		
		System.out.println("Você tem "+ ((anos*365) + (meses*30)+ dias) +" dias de vida!");
		sc.close();
	}
}