
package ch.hearc.cours.moo.hello;

import org.junit.Assert;

public class Linear implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * a != 0
	 */
	public Linear(double a, double b)
		{
		Assert.assertTrue(a != 0);
		this.a = a;
		this.b = b;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public double solve()
		{
		Assert.assertTrue(this.a != 0);
		return -this.b / this.a;
		}

	@Override
	public void run()
		{
		x = -b / a;
		}

	@Override
	public String toString()
		{
		return "a= " + a + " b = " + b + " x = " + x; //TODO A optimiser
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getX()
		{
		return this.x;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	double a;
	double b;

	//Output
	double x;

	//Tools

	}
