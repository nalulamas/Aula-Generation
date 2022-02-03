package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class EstoqueEx3 {
	public static void main (String args[])
	{
		Collection<String> dados = new ArrayList<>();
		dados.add("Cadeira");
		dados.add("Mesa");
		dados.add("Cama");
		dados.add("Sofá");
		
		System.out.println(dados);
		boolean existe = dados.contains("Mesa");
		System.out.println(existe);
		dados.add("Poltrona");
		System.out.println(dados);
		dados.remove("Cama");
		System.out.println(dados);
		dados.clear();
		System.out.println(dados);
					
		
	}

}
