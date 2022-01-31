/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console. */

package OrientacaoObjeto;

public class Exercicio6Construtor {
	
	String usuario;
	float saldo;
	int senha;
	boolean emUso;
	
	public void usar() {
		this.emUso = true;
	}

	public void parado() {
		this.emUso= false;
	}

	public void lembrete() {
		if (this.emUso == true)
			System.out.println("Colhendo informações.");
		else
			System.out.println("Aguardando comandos.");

	}

	public void status() {
		System.out.println("Olá, : " + this.usuario);
		System.out.println("Senha confirmada " + this.senha);
		System.out.println("Seu saldo é de R$" + this.saldo);
		System.out.println("Máquina em uso?" + this.emUso);
	}

	public void senha(int x) {
		// TODO Auto-generated method stub
		
	}

}
