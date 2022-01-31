package OrientacaoObjeto;

import java.util.Scanner;

public class Exercicio6Objeto {

	public static void main(String[] args) {
		int x;

		Scanner senha = new Scanner(System.in);

		System.out.print("Digite sua senha: ");

		x = senha.nextInt();

		Exercicio6Construtor user1 = new Exercicio6Construtor();

		user1.usuario= "Marlene";
		user1.saldo = 7.000f;
		user1.senha(x);
		user1.usar();;
		user1.status();
		user1.lembrete();
		
		System.out.println("_____________________________");
		user1.usuario= "Giovana";
		user1.saldo = 45.76f;
		user1.senha(x);
		user1.parado();;
		user1.status();
		user1.lembrete();

		senha.close();
	}

}
