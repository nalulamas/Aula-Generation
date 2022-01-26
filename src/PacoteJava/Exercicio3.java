/*/3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
programa 
 */
package PacoteJava;
	import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		int segundos;
		
		Scanner leia2= new Scanner (System.in);
		System.out.println("Quantos segundos do evento você quer converter? ");
		segundos =leia2.nextInt();
		
		System.out.println("\nConvertido em horas: " + (segundos/3600)+ "\nminutos: " +(segundos/60)+ "\nSegundos: " + segundos);
		leia2.close();
			}
}
