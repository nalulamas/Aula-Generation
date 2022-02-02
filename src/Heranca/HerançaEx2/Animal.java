package HerançaEx2;

public abstract class Animal {
	// Atributos de animal
	protected String nome;
	protected int idade;

	// metodos de animal
	public abstract void emitirSom();

	public abstract void locomocao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
