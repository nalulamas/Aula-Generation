package PacoteJava;
 import java.util.Scanner;
 
public class Exercicio4 {
	public static void main (String[] args) {
		 int valorA, valorB, valorC;
		 double valorR, valorS, valorD;
		 Scanner leia3= new Scanner (System.in);
		 
		 System.out.println ("Digite n�meros e descubra o valor de A, B e C. Sabendo que D=(R+S)/2, R=(A+B)� e S=(B+C)�");
		 System.out.println("\nDigite o valor de A: ");
		 	valorA =leia3.nextInt();
		 System.out.println("\nDigite o valor de B: ");
	    	valorB=leia3.nextInt();
	    System.out.println("\nDigita o valor de C: ");
	    	valorC=leia3.nextInt();
	    	
	    	valorR =Math.pow(valorA+valorB, 2);
	    	 valorS=Math.pow(valorB+valorC,2);
	    	 valorD= (valorR+valorS)/2;
	    	    	
	    System.out.println("O resultado do c�lculo �: "+ valorD);
	    leia3.close();
	}
}
