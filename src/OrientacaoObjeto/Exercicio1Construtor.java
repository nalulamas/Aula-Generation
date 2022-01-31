/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
package OrientacaoObjeto;

public class Exercicio1Construtor {

	String nome;
	float desconto;
	int consumo;
	boolean frequencia;

	public void frequentar() {
		this.frequencia = true;
	}

	public void ausente() {
		this.frequencia = false;
	}

	public void anuncio() {
		if (this.frequencia == true)
			System.out.println("Clientes fies merecem mais desconto!");
		else
			System.out.println("Gostaria de conhecer melhor nossas ofertas?");

	}

	public void status() {
		System.out.println("Cliente: " + nome);
		System.out.println("Cliente frequente? " + frequencia);
		System.out.println("Seu consumo foi de R$ " + consumo);
		System.out.println("Seu desconto é de: " + desconto + "%");
	}

}
