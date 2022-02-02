package Heranca;

public class HerancaAnimal {
	private String nome;
	private int idade;
	private String som;
	private String andar;
	
	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public HerancaAnimal (String nome, int idade, String som)
	{
		this.nome = nome;
		this.idade= idade;
		this.som =som
				;
	}

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

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
