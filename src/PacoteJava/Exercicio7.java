/*7. Um sistema de equa��es lineares do tipo: 
 * ax+by=c
 * dx+ey=f
 * 
 * , pode ser resolvido segundo mostrado abaixo : 
 * x=(ce-bf)/(ae-bd)      y=(af-cd)/(ae-bd)
 * 
 * Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/
package PacoteJava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String[] args) {
		Scanner leia6= new Scanner (System.in);
		
		System.out.println("Nos d� 6 n�meros para descobrirmos o valor de X e Y.\nSendo que X=(ce-bf)/(ae-bd)  Y=(af-cd)/(ae-bd) ");
		float a,b,c,d,e,f;
		float x,y,z;

		a =leia6.nextFloat();
		b =leia6.nextFloat();
		c =leia6.nextFloat();
		d =leia6.nextFloat();
		e =leia6.nextFloat();
		f =leia6.nextFloat();

		x= ((c*e) - (b*f));
		y= ((a*f) - (c*d));
		z= ((a*e) - (b*d));
		

System.out.println("O valor de x �: "+ x/z +"\nO valor de y �: "+ y/z);
leia6.close();
	}
}
