
package ch.hearc.cours.moo.hello;

import com.bilat.tools.io.console.Clavier;

public class UseQuadratique
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		double a;
		double b;
		double c;
		boolean isABOk;

		do
			{
			a = Clavier.lireDouble("a=");
			b = Clavier.lireDouble("b=");
			isABOk = a == 0 && b == 0;
			if (isABOk)
				{
				System.out.println("Valeur erronee!");
				}
			} while(isABOk);
		c = Clavier.lireDouble("c=");

		Quadratique quadratique = new Quadratique(a, b, c);
		quadratique.run();
		System.out.println(quadratique.toString());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
