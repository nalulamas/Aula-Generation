package OrientacaoObjeto;

public class Exercicio5Objeto {
	public static void main(String[] args) {
		Exercicio5Construtor pat1 = new Exercicio5Construtor();
		Exercicio5Construtor pat2 = new Exercicio5Construtor();

		pat1.modelo = "Infantil";
		pat1.rolamento = 7;
		pat1.parado();
		;
		pat1.adesivo = 100f;
		pat1.status();
		pat1.dica();

		System.out.println("_____________________________");
		pat2.modelo = "Profissional";
		pat2.rolamento = 11;
		pat2.andar();
		;
		pat2.adesivo = 25f;
		pat2.status();
		pat2.dica();
	}

}
