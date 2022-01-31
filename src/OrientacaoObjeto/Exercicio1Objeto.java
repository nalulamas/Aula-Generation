package OrientacaoObjeto;

public class Exercicio1Objeto {
	public static void main(String[] args) {
		Exercicio1Construtor c1 = new Exercicio1Construtor();
		Exercicio1Construtor c2 = new Exercicio1Construtor();

		c1.nome = "Maria";
		c1.consumo = 30;
		c1.frequentar();
		c1.desconto = 50f;
		c1.status();
		c1.anuncio();
		
		System.out.println("_____________________________");
		c2.nome = "Gilberto";
		c2.consumo = 10;
		c2.ausente();
		c2.desconto = 15f;
		c2.status();
		c2.anuncio();
	}
}
