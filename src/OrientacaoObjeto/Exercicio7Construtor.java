/*7) Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */
package OrientacaoObjeto;

public class Exercicio7Construtor {

	String paciente;
	float cura;
	int dias;
	boolean internado;
	
	public void internar() {
		this.internado = true;
	}

	public void alta() {
		this.internado= false;
	}

	public void lembrete() {
		if (this.internado == true)
			System.out.println("Paci�nte internado.");
		else
			System.out.println("Paciente recebeu alta.");

	}

	public void status() {
		System.out.println("Ol�, : " + this.paciente);
		System.out.println("dias de interna��o " + this.dias);
		System.out.println("Porcentagem de cura " + this.cura +"%");
		System.out.println("Paciente internado? " + this.internado);
	}


}

/*7) Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. 
package OrientacaoObjeto;

public class Exercicio7Construtor {

	String paciente;
	float cura;
	int dias;
	boolean internado;
	
	public void internar() {
		this.internado = true;
	}

	public void alta() {
		this.internado= false;
	}

	public void lembrete() {
		if (this.internado == true)
			System.out.println("Paci�nte internado.");
		else
			System.out.println("Paciente recebeu alta.");

	}

	public void status() {
		System.out.println("Ol�, : " + this.paciente);
		System.out.println("dias de interna��o " + this.dias);
		System.out.println("Porcentagem de cura " + this.cura +"%");
		System.out.println("Paciente internado? " + this.internado);
	}


}*/
