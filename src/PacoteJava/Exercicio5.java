/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
(n1+n2+n3)/(2+3+5)
(p1.n1)+(p2.n2)+(p3.n3)/(p1+p2+p3) 
 */
package PacoteJava;
	import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		double nota1, nota2, nota3;
		Scanner leia4= new Scanner (System.in);

		System.out.println("Calcule sua a m�dia final");
		System.out.println("\nPrimeira nota: ");
		nota1 =leia4.nextInt();
		System.out.println("\nSegunda nota: ");
		nota2 =leia4.nextInt();
		System.out.println("\nTerceira nota: ");
		nota3 =leia4.nextInt();
		
		System.out.println("Sua m�dia foi "+ ((nota1*2)+(nota2*3)+(nota3*5))/10+ ".");
		leia4.close();
	}

}
