//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package lacoderepeticao;
import java.util.Scanner;

public class Exercicio2FOR {

	public static void main(String[] args) {
		Scanner escreva1= new Scanner(System.in);
		short par=0, impar=0;
		
		for(short x=0;x<=9;x++)
		{
			System.out.println("Informe um n�mero: ");			
			
			if (escreva1.nextInt()%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("A quantidade de n�meros pares "+par);
		System.out.println("A quantidade de n�meros �mpares "+impar);
		
		escreva1.close();
	}

}
