//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
package lacoderepeticao;
public class Exercicio1FOR {
	
public class FORexercicio1 {
         public static void main (String args[]) {
                             
                for(int x=1000;x<=1999;x++)
                {
                  if ((x % 11) == 5)
                  System.out.println("O resto da divis�o de "+x+" � igual a 5");
                }

            }

    }

}
