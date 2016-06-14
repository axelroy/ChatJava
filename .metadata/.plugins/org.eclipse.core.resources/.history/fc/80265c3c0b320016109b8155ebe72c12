
package ch.hearc.cours.kitbase.equations;

import java.util.Arrays;

import org.junit.Assert;

import com.bilat.tools.io.console.Clavier;

public class Quadratique
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * return un tableau qui a autant de cases que de solutions. Si pas de solutions, le tableau existe mais a zéro cases.
	 */
	public static double[] solve(double a, double b, double c)
		{
		if (a == 0)
			{
			return solveLineaire(b, c);
			}
		else
			{
			return solveQuadratique(a, b, c);
			}
		}

	public static double[] solve(double[] tabCoefficient)
		{
		return solve(tabCoefficient[0], tabCoefficient[1], tabCoefficient[2]);
		}

	public static double discriminant(double a, double b, double c)
		{
		return (b * b) - (4 * a * c);
		}

	public static double discriminant(double[] tabCoefficient)
		{
		return discriminant(tabCoefficient[0], tabCoefficient[1], tabCoefficient[2]);
		}

	public static void print(double a, double b, double c, double[] tabX)
		{
		System.out.println(Arrays.toString(tabX));
		//
		//		System.out.println(a + "x2 +" + b + "x +" + c + "= 0");
		//		if (tabX.length == 0)
		//			{
		//			System.out.println("Pas de solutions");
		//			}
		//		else
		//			{
		//			int i = 1;
		//			for(double solutionI:tabX)
		//				{
		//				System.out.println("\tX" + i + " = " + solutionI);
		//				i++;
		//				}
		//			}
		}

	public static void print(double[] tabCoefficient, double[] tabX)
		{
		print(tabCoefficient[0], tabCoefficient[1], tabCoefficient[2], tabX);
		}

	public static double[] saisir()
		{
		boolean isABOk;
		double[] tabCoefficient = new double[3];
		do
			{
			tabCoefficient[0] = Clavier.lireDouble("a=");
			tabCoefficient[1] = Clavier.lireDouble("b=");
			isABOk = tabCoefficient[0] == 0 && tabCoefficient[1] == 0;
			if (isABOk)
				{
				System.out.println("Valeur erronee!");
				}
			} while(isABOk);
		tabCoefficient[2] = Clavier.lireDouble("c=");

		return tabCoefficient;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	/**
	 * Hyp : a!=0 && b!=0
	 */
	private static double[] solveQuadratique(double a, double b, double c)
		{
		Assert.assertTrue(a != 0 && b != 0);
		double discriminant = discriminant(a, b, c);
		if (discriminant > 0)
			{

			// V1
			//				{
			//			double[] tabResult = new double[2];
			//			tabResult[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
			//			tabResult[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
			//			return tabResult;
			//				}

			// V2
				{
				double[] tabX = { (-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a) };
				return tabX;
				}
			}
		else if (discriminant == 0)
			{

			// V1
				{
				//			double[] tabX = new double[1];
				//			tabX[0] = -b / (2 * a);
				//			return tabX;
				}

			// V2
				{
				double[] tabX = { -b / (2 * a) };
				return tabX;
				}

			}
		else
			{
			double[] tabX = new double[0];
			return tabX;
			}
		}

	private static double[] solveLineaire(double b, double c)
		{
		double[] tabX = new double[1];
		tabX[0] = Lineaire.solve(b, c);
		return tabX;
		}
	}
