/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console. */
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
			System.out.println("O funcion�rio est� trabalhando.");
		else
			System.out.println("O funcion�rio est� parado. ");	
	}
		
		public void status() {
			System.out.println("Nome do funcion�rio: " + this.funcionario);
			System.out.println("O funcion�rio esta trabalhando? " + this.trabalhando);
			System.out.println("Por quantos dias?" + this.dias);
			System.out.println("Jornada de hoje: " + this.jornada + "% conclu�da");

}
}