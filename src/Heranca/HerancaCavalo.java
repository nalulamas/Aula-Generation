package Heranca;

public class HerancaCavalo extends HerancaAnimal{
	private String horse;
	
	public HerancaCavalo(String nome, int idade, String som, String correr)
	{
		super (nome, idade, som);
		this.horse= correr;
	}

	public String getHorse() {
		return horse;
	}

	public void setHorse(String horse) {
		this.horse = horse;
	}

	

}
