package Heranca;

public class HerancaFinal {
	public static void main (String args[])
	{
		HerancaAnimal auau = new HerancaCachorro ("Tob", 12, "Latido", "Corre");
		HerancaAnimal pocoto = new HerancaCavalo ("Epona", 5, "Relincho","Corre");
		HerancaAnimal lazy = new HerancaPreguica ("Sussu", 2, "Grunido","Sobe em árvores" );
		System.out.println(auau.getNome());
		System.out.println(pocoto.getNome());
		System.out.println(lazy.getNome());
		System.out.println(auau.getIdade());
		System.out.println(pocoto.getIdade());
		System.out.println(lazy.getIdade());
		System.out.println(auau.getSom());
		System.out.println(pocoto.getSom());
		System.out.println(lazy.getSom());
			
	}

}
