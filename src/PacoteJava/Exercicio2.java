/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
 */
package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
	int dias;
	
	Scanner leia1= new Scanner(System.in);
	
	System.out.println("Quantos dias de vida você tem? ");
	dias =leia1.nextInt();
	
	System.out.println("\nVocê tem " +(dias/365)+" anos de vida."+"\nmeses: "+(dias%365)/30+"\nDias: "+ dias);
	leia1.close();
	}	
}
