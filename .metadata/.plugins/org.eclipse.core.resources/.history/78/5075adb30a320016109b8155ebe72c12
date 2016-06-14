
package ch.hearc.cours.moo.thread.addVector;

import org.junit.Assert;

public class AddVector implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * hyp : tableau de même taille
	 */
	public AddVector(double[] v1, double[] v2)
		{
		Assert.assertTrue(v1.length == v2.length);
		this.v1 = v1;
		this.v2 = v2;
		w = new double[v1.length];
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		int middle = v1.length / 2;

		Runnable addPortionGauche = new AddPortion(0, middle, v1, v2, w);
		Runnable addPortionDroite = new AddPortion(middle + 1, v1.length - 1, v1, v2, w);

		Thread tGauche = new Thread(addPortionGauche);
		Thread tDroite = new Thread(addPortionDroite);

		tGauche.start();
		tDroite.start();
		try
			{
			tGauche.join();
			tDroite.join();
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double[] getW()
		{
		return this.w;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private double[] v1;
	private double[] v2;

	//output
	private double[] w;

	}
