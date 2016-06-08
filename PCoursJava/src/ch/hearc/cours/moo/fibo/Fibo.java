
package ch.hearc.cours.moo.fibo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;

public class Fibo implements Runnable ,Iterable<BigInteger>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Hyp: n>=2
	 */
	public Fibo(int n)
		{
		Assert.assertTrue(n >= 2);

		// Inputs
		this.n = n;

		// Outputs
		this.tabSuite = new BigInteger[n];
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		tabSuite[0] = new BigInteger("0");
		tabSuite[1] = new BigInteger("1");

		for(int i = 2; i < n; i++)
			{
			tabSuite[i] = tabSuite[i - 1].add(tabSuite[i - 2]); // iteratif plus rapide que recursif
			}
		}

	@Override
	public Iterator<BigInteger> iterator()
		{
		return Arrays.asList(tabSuite).iterator(); // Notez le truc pour obtenir un iterator d'un tableau!
		}

	@Override
	public String toString()
		{
		StringBuilder str = new StringBuilder();

		int i = 0;
		for(BigInteger valeur:this)// car Fibo est Iterable<BigInteger>
			{
			int nbDigit = valeur.toString().length();

			str.append(i);
			str.append(TABULATION);
			str.append(nbDigit);
			str.append(TABULATION);
			str.append(valeur);
			str.append(END_LINE);

			i++;
			}

		return str.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public BigInteger[] getTabSuite()
		{
		return this.tabSuite;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Inputs
	private int n;

	// Outputs
	private BigInteger[] tabSuite;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String TABULATION = "\t";
	private static final String END_LINE = "\n";

	}
