/*6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
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
			System.out.println("Colhendo informa��es.");
		else
			System.out.println("Aguardando comandos.");

	}

	public void status() {
		System.out.println("Ol�, : " + this.usuario);
		System.out.println("Senha confirmada " + this.senha);
		System.out.println("Seu saldo � de R$" + this.saldo);
		System.out.println("M�quina em uso?" + this.emUso);
	}

	public void senha(int x) {
		// TODO Auto-generated method stub
		
	}

}
