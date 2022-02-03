
package OrientacaoObjeto;

public class Exercicio3Objeto {	
		
		public static void main(String[] args) {
			Exercicio3Construtor cel1 = new Exercicio3Construtor();
			Exercicio3Construtor cel2 = new Exercicio3Construtor();

			cel1.cor = "Rosa";
			cel1.apps = 25;
			cel1.desligar();
			cel1.bateria = 50f;
			cel1.status();
			cel1.situacao();
			
			System.out.println("_____________________________");
			cel2.cor = "Azul";
			cel2.apps = 99;
			cel2.ligar();
			cel2.bateria = 76f;
			cel2.status();
			cel2.situacao();
	}

}

/*package OrientacaoObjeto;

public class Exercicio3Objeto {	
		
		public static void main(String[] args) {
			Exercicio3Construtor cel1 = new Exercicio3Construtor();
			Exercicio3Construtor cel2 = new Exercicio3Construtor();

			cel1.cor = "Rosa";
			cel1.apps = 25;
			cel1.desligar();
			cel1.bateria = 50f;
			cel1.status();
			cel1.situacao();
			
			System.out.println("_____________________________");
			cel2.cor = "Azul";
			cel2.apps = 99;
			cel2.ligar();
			cel2.bateria = 76f;
			cel2.status();
			cel2.situacao();
	}

}*/

