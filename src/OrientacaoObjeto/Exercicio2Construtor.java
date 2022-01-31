/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */
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
			System.out.println("Ainda n�o estamos decolando. ");

	}

	public void status() {
		System.out.println("Ol�! " + this.boaviagem);
		System.out.println("Quantas passagens?  " + this.passagens);
		System.out.println("Situa��o do avi�o: " +this.decolando);
		System.out.println("Estamos " +this.trajeto+"% de distancia do destino.");
		
	}
}
