package OrientacaoObjeto;


public class Exercicio2Objeto {
	public static void main(String[] args) {
		Exercicio2Construtor p1 = new Exercicio2Construtor();
		Exercicio2Construtor p2 = new Exercicio2Construtor();

		p1.boaviagem = "Maria. Uma boa viagem!";
		p1.passagens = 2;
		p1.decolar();
		p1.trajeto = 24f;
		p1.status();
		p1.escrever();

		System.out.println("_____________________________");
		p2.boaviagem = "Gilberto. Uma boa viagem!";
		p2.passagens = 1;
		p2.noChao();
		p2.trajeto = 278f;
		p2.status();
		p2.escrever();

		
		
	}
}
