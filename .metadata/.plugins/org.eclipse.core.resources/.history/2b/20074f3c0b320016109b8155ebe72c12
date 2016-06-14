
package ch.hearc.cours.kitbase.tools;

import java.util.Random;

import org.junit.Assert;

public class RandomTools
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * @return [0,limiteMax]
	 */
	public static int random(int limiteMax)
		{
		return random(RANDOM,limiteMax);
		}

	/**
	 * @return [limiteMin, limiteMax]
	 */
	public static int randomMinMax(int limiteMin, int limiteMax)
		{
		return randomMinMax(RANDOM,limiteMin,limiteMax);
		}

	/**
	 * @return [0,limiteMax]
	 */
	public static int random(Random random, int limiteMax)
		{
		int n = random.nextInt(limiteMax) + 1;

		Assert.assertTrue(n >= 1 && n <= limiteMax);
		return n;
		}

	/**
	 * @return [limiteMin, limiteMax]
	 */
	public static int randomMinMax(Random random, int limiteMin, int limiteMax)
		{
		int n = random.nextInt(limiteMax + 1 - limiteMin) + limiteMin;

		Assert.assertTrue(n >= limiteMin && n <= limiteMax);
		return n;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Random RANDOM = new Random(System.currentTimeMillis());

	}
