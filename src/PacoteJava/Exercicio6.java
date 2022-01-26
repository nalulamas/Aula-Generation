/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
escreva a distância entre eles. A fórmula que efetua tal cálculo é:  
D= raiz quadrada de (x2-x1)² + (y2+y1)² 
 */
package PacoteJava;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main (String[] args) {
		Scanner leia5= new Scanner (System.in);
		
		System.out.println ("Descubra a distância entre dois pontos. Digite 4 números: ");	
		
		double x1, x2, y1, y2,result;
		x1=leia5.nextDouble();
		x2=leia5.nextDouble();
		y1=leia5.nextDouble();
		y2=leia5.nextDouble();
		
		double p1, p2;
			p1=Math.pow(x2-x1, 2);
			p2=Math.pow(y2+y1, 2);
			result=p1+p2;

			System.out.println ("\nO valor de P é: "+ Math.sqrt(result));
				leia5.close();
		
	}

}
