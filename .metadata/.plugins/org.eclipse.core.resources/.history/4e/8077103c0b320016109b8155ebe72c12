
package ch.hearc.cours.moo.thread.addVector;

public class AddPortion implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * w = v1 + v2 sur [istart,istop]
	 */
	public AddPortion(int iStart, int iStop, double[] v1, double[] v2, double[] w)
		{
		this.iStart = iStart;
		this.iStop = iStop;
		this.v1 = v1;
		this.v2 = v2;
		this.w = w;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		for(int i = iStart; i <= iStop; i++)
			{
			w[i] = v1[i] + v2[i];
			}
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private int iStart;
	private int iStop;
	private double[] v1;
	private double[] v2;
	private double[] w;

	}
