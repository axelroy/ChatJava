
package ch.hearc.cours.kitbase.parametresentrees.proprieteessystemes;

import ch.hearc.cours.kitbase.equations.Quadratique;

public class UseQuadratiqueProprieteesSystemes
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
		double[] tabCoefficient = new double[3];
		tabCoefficient[0] = toDouble(System.getProperty("a"));
		tabCoefficient[1] = toDouble(System.getProperty("b"));
		tabCoefficient[2] = toDouble(System.getProperty("c"));

		double[] tabX = Quadratique.solve(tabCoefficient);
		Quadratique.print(tabCoefficient, tabX);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
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
	}
