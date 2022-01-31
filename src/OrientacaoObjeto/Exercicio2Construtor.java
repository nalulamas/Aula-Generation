/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
package OrientacaoObjeto;

public class Exercicio2Construtor {
	String boaviagem;
	float trajeto;
	int passagens;
	boolean decolando;
	
	public void decolar() {
		this.decolando = true;
	}

	public void noChao() {
		this.decolando = false;
	}

	public void escrever() {
		if (this.decolando == true)
			System.out.println("Estamos decolando! ");
		else
			System.out.println("Ainda não estamos decolando. ");

	}

	public void status() {
		System.out.println("Olá! " + this.boaviagem);
		System.out.println("Quantas passagens?  " + this.passagens);
		System.out.println("Situação do avião: " +this.decolando);
		System.out.println("Estamos " +this.trajeto+"% de distancia do destino.");
		
	}
}
