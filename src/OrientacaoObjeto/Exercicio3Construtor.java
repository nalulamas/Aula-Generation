/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console. */
package OrientacaoObjeto;

public class Exercicio3Construtor {
	

	String cor;
	float bateria;
	int apps;
	boolean ligado;
	
	public void ligar()
	{
		this.ligado=true;
	}
	public void desligar()
	{
		this.ligado=false;
	}

	public void situacao() {
		if (this.ligado == true)
			System.out.println("Celular ligado.");
		else
			System.out.println("Celular desligado. ");	
	}
		
		public void status() {
			System.out.println("Cor do celular: " + this.cor);
			System.out.println("Celular está ligado? " + this.ligado);
			System.out.println("Quantos apps?" + this.apps);
			System.out.println("Porcentagem de bateria: " + this.bateria + "%");
	
	}
}
