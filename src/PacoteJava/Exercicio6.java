/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:  
D= raiz quadrada de (x2-x1)� + (y2+y1)� 
 */
package PacoteJava;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main (String[] args) {
		Scanner leia5= new Scanner (System.in);
		
		System.out.println ("Descubra a dist�ncia entre dois pontos. Digite 4 n�meros: ");	
		
		double x1, x2, y1, y2,result;
		x1=leia5.nextDouble();
		x2=leia5.nextDouble();
		y1=leia5.nextDouble();
		y2=leia5.nextDouble();
		
		double p1, p2;
			p1=Math.pow(x2-x1, 2);
			p2=Math.pow(y2+y1, 2);
			result=p1+p2;

			System.out.println ("\nO valor de P �: "+ Math.sqrt(result));
				leia5.close();
		
	}

}
