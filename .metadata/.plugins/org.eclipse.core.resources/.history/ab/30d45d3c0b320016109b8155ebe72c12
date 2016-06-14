
package ch.hearc.cours.kitbase.equations;

import org.junit.Assert;

import com.bilat.tools.io.console.Clavier;

/**
 * @author quentin.christe
 */
public class Lineaire
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * @param a: hyp: a!=0
	 */
	public static double solve(double a, double b)
		{
		Assert.assertTrue(a != 0);
		return -b / a;
		}

	/**
	 * tabCoefficient: [0]=a [1]=b: <b>hyp</b>: a!=0
	 */
	public static double solve(double[] tabCoefficient)
		{
		return solve(tabCoefficient[0], tabCoefficient[1]);
		}

	public static void print(double a, double b, double x)
		{
		System.out.println(a + "x +" + b + "= 0" + "\t x = " + x);
		}

	public static void print(double[] tabCoefficient, double x)
		{
		print(tabCoefficient[0], tabCoefficient[1], x);
		}

	public static double[] saisir()
		{
		double[] tabCoefficient = new double[2];
		do
			{
			tabCoefficient[0] = Clavier.lireDouble("a=");
			if (tabCoefficient[0] == 0)
				{
				System.out.println("Valeur erronee!");
				}
			} while(tabCoefficient[0] == 0);

		tabCoefficient[1] = Clavier.lireDouble("b=");

		return tabCoefficient;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
