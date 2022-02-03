package HerançaEx2;

public class Ex2Principal {

	public static void main(String[] args) {
		CachorroEx2 auau = new CachorroEx2();
		CavaloEx2 pocoto = new CavaloEx2();
		PreguicaEx2 lazy = new PreguicaEx2();
		
		System.out.println(" Especificações do cachorro");
		auau.setNome("Bruno");
		auau.setIdade(2);
		auau.emitirSom();
		auau.locomocao();
		System.out.println(auau.getNome());
		System.out.println(auau.getIdade());
		
		System.out.println(" Especificações do Cavalo");
		pocoto.setNome("Junin");
		pocoto.setIdade(7);
		pocoto.emitirSom();
		pocoto.locomocao();
		System.out.println(pocoto.getNome());
		System.out.println(pocoto.getIdade());
		
		System.out.println(" Especificações da Preguiça");
		lazy.setNome("Jully");
		lazy.setIdade(4);
		lazy.emitirSom();
		lazy.locomocao();
		System.out.println(lazy.getIdade());
		System.out.println(lazy.getNome());
	}

}
