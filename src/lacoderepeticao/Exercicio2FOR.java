//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
package lacoderepeticao;
import java.util.Scanner;

public class Exercicio2FOR {

	public static void main(String[] args) {
		Scanner escreva1= new Scanner(System.in);
		short par=0, impar=0;
		
		for(short x=0;x<=9;x++)
		{
			System.out.println("Informe um número: ");			
			
			if (escreva1.nextInt()%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("A quantidade de números pares "+par);
		System.out.println("A quantidade de números ímpares "+impar);
		
		escreva1.close();
	}

}
