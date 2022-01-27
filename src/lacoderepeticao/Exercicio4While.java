package lacoderepeticao;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		int x=0,idade=0, genero=0,temperamento=0;
		short pCalm=0, mNerv=0, hAgr=0, oCalm=0, pNerv40=0, pCalm18=0;
		
		Scanner leiaIdade= new Scanner(System.in);
		Scanner leiaGenero= new Scanner(System.in);
		Scanner leiaTemperamento= new Scanner(System.in);
		
		
		while (x<=150)
		{
			x++;
			System.out.println("Informe sua idade: ");
			idade=leiaIdade.nextInt();
			System.out.println("Informe seu genêro: 1-feminino, 2-masculino, 3-Outros ");
			genero=leiaGenero.nextInt();
			System.out.println("Informe seu temperamento: 1-calmo, 2-nervosa, 3-agressivo ");
			temperamento=leiaTemperamento.nextInt();
			
			if (temperamento==1)
			{
				pCalm++;
			}
			if (genero==1 && temperamento==2)
			{
				mNerv++;
			}
			if (genero==2 && temperamento==3)
			{
				hAgr++;
			}
			if (genero==3 && temperamento==1)
			{
				oCalm++;
			}
			if(temperamento==2 && idade>40)
			{
				pNerv40++;
			}
			if(temperamento==1 && idade<18)
			{
				pCalm18++;
			}
		}
		
		System.out.println("O número de pessoas calmas:  "+pCalm);
		System.out.println("O número de mulheres nervosas:  "+mNerv);
		System.out.println("O número de homens agressivos:  "+hAgr);
		System.out.println("O número de outros calmos:  "+oCalm);
		System.out.println("O número de pessoas nervosas com mais de 40 anos:  "+pNerv40);
		System.out.println("O número de pessoas calmas com menos de 18 anos:  "+pCalm18);
		
		leiaIdade.close();
		leiaGenero.close();
		leiaTemperamento.close();
	}

}
