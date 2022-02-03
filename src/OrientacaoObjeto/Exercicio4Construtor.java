
package OrientacaoObjeto;

public class Exercicio4Construtor {
	String funcionario;
	float jornada;
	int dias;
	boolean trabalhando;
	
	public void trabalhar()
	{
		this.trabalhando=true;
	}
	public void parado()
	{
		this.trabalhando=false;
	}

	public void situacao() {
		if (this.trabalhando == true)
			System.out.println("O funcionário está trabalhando.");
		else
			System.out.println("O funcionário está parado. ");	
	}
		
		public void status() {
			System.out.println("Nome do funcionário: " + this.funcionario);
			System.out.println("O funcionário esta trabalhando? " + this.trabalhando);
			System.out.println("Por quantos dias?" + this.dias);
			System.out.println("Jornada de hoje: " + this.jornada + "% concluída");

}
}
/*
package OrientacaoObjeto;

public class Exercicio4Construtor {
	String funcionario;
	float jornada;
	int dias;
	boolean trabalhando;
	
	public void trabalhar()
	{
		this.trabalhando=true;
	}
	public void parado()
	{
		this.trabalhando=false;
	}

	public void situacao() {
		if (this.trabalhando == true)
			System.out.println("O funcionário está trabalhando.");
		else
			System.out.println("O funcionário está parado. ");	
	}
		
		public void status() {
			System.out.println("Nome do funcionário: " + this.funcionario);
			System.out.println("O funcionário esta trabalhando? " + this.trabalhando);
			System.out.println("Por quantos dias?" + this.dias);
			System.out.println("Jornada de hoje: " + this.jornada + "% concluída");

}
>>>>>>> fbdd4c25a35bb8c42252599914ba11d1ea2387e7
}*/