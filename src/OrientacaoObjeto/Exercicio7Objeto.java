package OrientacaoObjeto;

public class Exercicio7Objeto {

	public static void main(String[] args) {
		Exercicio7Construtor pac1 = new Exercicio7Construtor();

		pac1.paciente= "João de Freitas";
		pac1.dias = 7;
		pac1.internar();
		pac1.cura = 23f;
		pac1.status();
		pac1.lembrete();

		System.out.println("_____________________________");
		pac1.paciente= "Rafael Monteiro";
		pac1.dias = 54;
		pac1.alta();
		pac1.cura = 100f;
		pac1.status();
		pac1.lembrete();
	}

}
/*
package OrientacaoObjeto;

public class Exercicio7Objeto {

	public static void main(String[] args) {
		Exercicio7Construtor pac1 = new Exercicio7Construtor();

		pac1.paciente= "João de Freitas";
		pac1.dias = 7;
		pac1.internar();
		pac1.cura = 23f;
		pac1.status();
		pac1.lembrete();

		System.out.println("_____________________________");
		pac1.paciente= "Rafael Monteiro";
		pac1.dias = 54;
		pac1.alta();
		pac1.cura = 100f;
		pac1.status();
		pac1.lembrete();
	}

}*/

