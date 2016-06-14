
package ch.hearc.cours.moo.hello;

import org.junit.Assert;

public class Quadratique implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Hype : a != 0 && b != 0
	 */
	public Quadratique(double a, double b, double c)
		{
		Assert.assertTrue(!(a == 0 && b == 0));
		this.a = a;
		this.b = b;
		this.c = c;
		}
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		if (this.a == 0)
			{
			solveLineaire();
			}
		else
			{
			solveQuadratique();
			}
		}

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.a);
		stringBuilder.append(Quadratique.X2);
		stringBuilder.append(this.b);
		stringBuilder.append(Quadratique.X);
		stringBuilder.append(this.c);
		stringBuilder.append(Quadratique.RES);

		if (tabX.length == 0)
			{
			stringBuilder.append("\tPas de solutions");
			}
		else
			{
			int i = 1;
			for(double solutionI:tabX)
				{
				stringBuilder.append("\tX");
				stringBuilder.append(i);
				stringBuilder.append(" = ");
				stringBuilder.append(solutionI);
				i++;
				}
			}
		return stringBuilder.toString();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double[] getTabX()
		{
		return this.tabX;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void solveQuadratique()
		{
		this.discriminant = discriminant();
		if (this.discriminant > 0)
			{
			this.tabX = new double[] { (-this.b + Math.sqrt(this.discriminant)) / (2 * this.a), (-this.b - Math.sqrt(this.discriminant)) / (2 * this.a) };
			}
		else if (this.discriminant == 0)
			{
			this.tabX = new double[] { -this.b / (2 * this.a) };
			}
		else
			{
			this.tabX = new double[0];
			}
		}

	private double discriminant()
		{
		return (this.b * this.b) - (4 * this.a * this.c);
		}

	private void solveLineaire()
		{
		this.tabX = new double[1];
		Linear lin = new Linear(this.b, this.c);
		this.tabX[0] = lin.solve();
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	double a;
	double b;
	double c;

	//Output
	double[] tabX;

	//Tools
	double discriminant;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String X2 = "x2 +";
	private static final String X = "x +";
	private static final String RES = "=0 ";

	}
