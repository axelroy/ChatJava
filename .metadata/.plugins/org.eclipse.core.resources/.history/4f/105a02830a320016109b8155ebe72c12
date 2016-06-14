
package ch.hearc.cours.kitbase.parametresentrees.args;

import org.junit.Assert;

import ch.hearc.cours.kitbase.equations.Quadratique;

public class UseQuadratiqueArgs
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Ex: a=7 b=8 c=6
	 *
	 */
	public static void main(String[] args)
		{
		double[] tabCoefficient = parser(args);
		double[] tabX = Quadratique.solve(tabCoefficient);
		Quadratique.print(tabCoefficient, tabX);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static double[] parser(String[] tabArgs)
		{
		Assert.assertTrue(tabArgs.length == 3);
		double[] tabCoefficient = new double[3];
		int i = 0;
		for(String elementI:tabArgs)
			{
			String valeur = parser(elementI);
			tabCoefficient[i] = toDouble(valeur);
			i++;
			}
		return tabCoefficient;
		}

	private static double toDouble(String valeur)
		{
		try
			{
			return Double.valueOf(valeur);
			}
		catch (NumberFormatException e)
			{
			System.err.println("Not a number: " + valeur);
			System.exit(-1); // 0 normal, -1 anormal
			return -1;
			}

		}

	private static String parser(String elementI)
		{

		//V1: Tronconneuse
		//		{
		//		StringTokenizer parser = new StringTokenizer(elementI, "=");
		//		int compteur = 0;
		//		while(parser.hasMoreTokens())
		//			{
		//			if (compteur == 1) { return parser.nextToken(); }
		//			parser.nextToken();
		//			compteur++;
		//			}
		//		return null;
		//		}

		//V2: Version light
			{
			String[] tabValue = elementI.split("=");
			return tabValue[1];
			}
		}

	}
