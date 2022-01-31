package OrientacaoObjeto;

public class Exercicio4Objeto {

	public static void main(String[] args) {
		Exercicio4Construtor func1 = new Exercicio4Construtor();
		Exercicio4Construtor func2 = new Exercicio4Construtor();

		func1.funcionario = "Rosangela";
		func1.dias = 25;
		func1.parado();;
		func1.jornada=34f;
		func1.status();
		func1.situacao();
		
		System.out.println("_____________________________");
		func2.funcionario = "Abreu";
		func2.dias = 75;
		func2.trabalhar();;
		func2.jornada=67f;
		func2.status();
		func2.situacao();
} 
}
