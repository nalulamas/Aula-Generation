package Heranca;

public class HerancaCachorro extends HerancaAnimal{
	private String dog;
	
	public HerancaCachorro(String nome, int idade, String som, String correr)
	{
		super (nome, idade, som);
		this.dog = correr;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	

}
