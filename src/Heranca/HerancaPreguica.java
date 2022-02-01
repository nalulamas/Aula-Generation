package Heranca;

public class HerancaPreguica extends HerancaAnimal {
	private String Sloths;
	
	public HerancaPreguica (String nome, int idade, String som, String SubirArvore)
	{
		super (nome, idade, som);
		this.Sloths=SubirArvore;
	}

	public String getSloths() {
		return Sloths;
	}

	public void setSloths(String sloths) {
		Sloths = sloths;
	}

	

}
